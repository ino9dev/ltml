package com.ino9dev.generator

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import com.ino9dev.ltml.impl.ManifestImpl
import com.ino9dev.ltml.impl.LoadTestImpl
import com.ino9dev.ltml.Manifest
import com.ino9dev.ltml.LoadTest
import java.util.Calendar
import com.ino9dev.ltml.impl.ReportImpl
import java.text.SimpleDateFormat
import com.ino9dev.ltml.impl.ScheduleImpl
import com.ino9dev.ltml.impl.LtmlFactoryImpl
import java.io.File
import org.eclipse.xtext.generator.AbstractFileSystemAccess
import com.ino9dev.ltml.impl.DataTableImpl
import com.ino9dev.ltml.SHAREMODE
import com.ino9dev.ltml.ENCODINGTYPE
import com.ino9dev.ltml.QueryType

class LoadTestJmeterTestPlanGenerator implements IGenerator {
    
    val dateformatter = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss")
    val PATHSEPARATOR = "//"
    
    override doGenerate(Resource resource, IFileSystemAccess fsa) {

        //to get manifest object
        //manifest is only one
        val manifest = resource.allContents.filter(typeof(ManifestImpl)).head

        //to get loadtest(s) object
        val loadtests = resource.allContents.filter(typeof(LoadTestImpl))

        //pathを設定する
        val afsa = if(fsa instanceof AbstractFileSystemAccess){fsa as AbstractFileSystemAccess}
        val path = if(manifest.modelinstancedpath != null || manifest.modelinstancedpath != ""){manifest.modelinstancedpath}else{"."+PATHSEPARATOR}

        //pathに対してフォルダを作り、pathを出力先とする
        afsa.setOutputPath(path)
        path.createFolder

        //loadtest毎にjmxファイルをgerateする
        loadtests.forEach[
            loadtest|
            afsa.generateFile(
               '''«manifest.name»_ver_«manifest.version»_«loadtest.name».jmx''',
               //to JmeterTestPlan
               toJmeterTestPlan(
                   manifest,
                   loadtest
               )
            )
        ]
        
        //instanced file を invokeできるinvokerも併せて生成しておく
        
    }

    def toJmeterTestPlan(
        Manifest manifest,
        LoadTest loadtest
    ){
                
        '''
        <?xml version="1.0" encoding="UTF-8"?>
        <jmeterTestPlan version="1.2" properties="2.8" jmeter="2.13 r1665067">
          <hashTree>
            <TestPlan guiclass="TestPlanGui" testclass="TestPlan" testname="«manifest.name»" enabled="true">
              <stringProp name="TestPlan.comments"></stringProp>
              <boolProp name="TestPlan.functional_mode">false</boolProp>
              <boolProp name="TestPlan.serialize_threadgroups">false</boolProp>
              <elementProp name="TestPlan.user_defined_variables" elementType="Arguments" guiclass="ArgumentsPanel" testclass="Arguments" testname="userdefine" enabled="true">
                <collectionProp name="Arguments.arguments"/>
              </elementProp>
              <stringProp name="TestPlan.user_define_classpath"></stringProp>
            </TestPlan>
            <hashTree>
            «var report = if(loadtest.report != null){loadtest.report}else{(new LtmlFactoryImpl).createReport}»
            «FOR lg:loadtest.loadgroups»
              «var schedule = 
                  //if all schedules are null then new NullObject 
                  if(loadtest.schedule == null && lg.schedule == null){(new LtmlFactoryImpl).createSchedule}
                  //if loadtest has schedule then it uses loadtest' schedule
                  else if(loadtest.schedule != null){loadtest.schedule}
                  //if loadtest has no schedule and load group has a schedule then it uses loadgroup's schedule
                  else if(lg.schedule != null){lg.schedule}»
              «var schedule_starttime = if(schedule.start == null){Calendar.instance.time.time}else{dateformatter.parse(schedule.start).time} »
              «var schedule_endtime = if(schedule.end == null){Calendar.instance.time.time}else{dateformatter.parse(schedule.end).time} »
              
              «var rampup = lg.rampup.splitaslist("/")»
              «var pertime = rampup.get(1).toString»
              «var ramptime = switch pertime {
                case pertime.endsWith("second") : Integer::valueOf(pertime.replace("min",""))
                case pertime.endsWith("min") : Integer::valueOf(pertime.replace("min","")) * 60
                case pertime.endsWith("hour") : Integer::valueOf(pertime.replace("hour","")) * 60 * 60
                default: 60*60 //default is 1min
            }»
              <ThreadGroup guiclass="ThreadGroupGui" testclass="ThreadGroup" testname="«lg.name»" enabled="true">
                <stringProp name="ThreadGroup.on_sample_error">continue</stringProp>
                <elementProp name="ThreadGroup.main_controller" elementType="LoopController" guiclass="LoopControlPanel" testclass="LoopController" testname="loopcontroller" enabled="true">
                  <boolProp name="LoopController.continue_forever">false</boolProp>
                  <stringProp name="LoopController.loops"></stringProp>
                </elementProp>
                <stringProp name="ThreadGroup.num_threads">«lg.cc»</stringProp>
                <stringProp name="ThreadGroup.ramp_time">«ramptime»</stringProp>
                <boolProp name="ThreadGroup.scheduler">true</boolProp>
                <longProp name="ThreadGroup.start_time">«schedule_starttime»</longProp>
                <longProp name="ThreadGroup.end_time">«schedule_endtime»</longProp>
                <stringProp name="ThreadGroup.duration">«schedule.duration»</stringProp>
                <stringProp name="ThreadGroup.delay">«schedule.delay»</stringProp>
              </ThreadGroup>
              <hashTree>
              «IF (lg.script.datatable != null && lg.script.datatable.length != 0)»
              «FOR dt:lg.script.datatable»
              <CSVDataSet guiclass="TestBeanGUI" testclass="CSVDataSet" testname="«dt.name»" enabled="true">
                  <stringProp name="delimiter">«dt.delimiter»</stringProp>
                  <stringProp name="fileEncoding">«dt.encodingtype.instantiate»</stringProp>
                  <stringProp name="filename">«dt.path»</stringProp>
                  <boolProp name="quotedData">false</boolProp>
                  <boolProp name="recycle">true</boolProp>
                  <stringProp name="shareMode">«dt.sharemode.instantiate»</stringProp>
                  <boolProp name="stopThread">false</boolProp>
                  <stringProp name="variableNames">«FOR l:dt.layout BEFORE "" SEPARATOR "," AFTER "" »«dt.name».«l»«ENDFOR»</stringProp>
              </CSVDataSet>
              <hashTree/>
              «ENDFOR»
              «ENDIF»
              <TransactionController guiclass="TransactionControllerGui" testclass="TransactionController" testname="«lg.loadgroupname»" enabled="true">
                <boolProp name="TransactionController.includeTimers">false</boolProp>
                <boolProp name="TransactionController.parent">false</boolProp>
              </TransactionController>
              <hashTree>
              «FOR t:lg.script.transactions»
                <TransactionController guiclass="TransactionControllerGui" testclass="TransactionController" testname="«t.name»" enabled="true">
                  <boolProp name="TransactionController.includeTimers">false</boolProp>
                  <boolProp name="TransactionController.parent">false</boolProp>
                </TransactionController>
                <hashTree>
                  <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="«t.name»" enabled="true">
                    <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" testname="userdefinedvariable" enabled="true">
                      <collectionProp name="Arguments.arguments">
                        «FOR p:t.param»
                        <elementProp name="«p.key»" elementType="HTTPArgument">
                          <stringProp name="Argument.name">«p.key»</stringProp>
                          <stringProp name="Argument.value">«p.value»</stringProp>
                          <boolProp name="HTTPArgument.always_encode">false</boolProp>
                          <stringProp name="Argument.metadata">=</stringProp>
                          <boolProp name="HTTPArgument.use_equals">true</boolProp>
                        </elementProp>
                        «ENDFOR»
                      </collectionProp>
                    </elementProp>
                    <stringProp name="HTTPSampler.domain">«t.server»</stringProp>
                    <stringProp name="HTTPSampler.port">«if(t.port!=0){t.port}»</stringProp>
                    <stringProp name="HTTPSampler.connect_timeout">«if(t.connecttimeout!=0){t.connecttimeout}»</stringProp>
                    <stringProp name="HTTPSampler.response_timeout">«if(t.responsetimeout!=0){t.responsetimeout}»</stringProp>
                    <stringProp name="HTTPSampler.protocol">«t.protocol»</stringProp>
                    <stringProp name="HTTPSampler.contentEncoding"></stringProp>
                    <stringProp name="HTTPSampler.path">«t.path»</stringProp>
                    <stringProp name="HTTPSampler.method">«t.method»</stringProp>
                    <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
                    <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
                    <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
                    <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
                    <boolProp name="HTTPSampler.monitor">false</boolProp>
                    <stringProp name="HTTPSampler.embedded_url_re"></stringProp>
                  </HTTPSamplerProxy>
                  <hashTree>
                    «FOR r:t.responsehandler»
                    «IF r.querytype.equals(QueryType::REGEX)»
                    <RegexExtractor guiclass="RegexExtractorGui" testclass="RegexExtractor" testname="«r.name»" enabled="true">
                      <stringProp name="RegexExtractor.useHeaders">false</stringProp>
                      <stringProp name="RegexExtractor.refname">«r.name»</stringProp>
                      <stringProp name="RegexExtractor.regex">«r.querystring»</stringProp>
                      <stringProp name="RegexExtractor.template">$1$</stringProp>
                      <stringProp name="RegexExtractor.default">NOTMATCHED</stringProp>
                      <stringProp name="RegexExtractor.match_number">«r.ordinal»</stringProp>
                    </RegexExtractor>
                    <hashTree/>
                    «ENDIF»
                    «ENDFOR»
                  </hashTree>
                  «IF t.capturefilename != ""»
                  <ResultSaver guiclass="ResultSaverGui" testclass="ResultSaver" testname="Save Responses to a file" enabled="true">
                    <stringProp name="FileSaver.filename">«t.capturefilename»</stringProp>
                    <boolProp name="FileSaver.errorsonly">false</boolProp>
                    <boolProp name="FileSaver.skipautonumber">true</boolProp>
                    <boolProp name="FileSaver.skipsuffix">false</boolProp>
                    <boolProp name="FileSaver.successonly">false</boolProp>
                    <boolProp name="FileSaver.addTimstamp">true</boolProp>
                    <stringProp name="FileSaver.variablename"></stringProp>
                    <stringProp name="FileSaver.numberPadLen"></stringProp>
                  </ResultSaver>
                  <hashTree/>
                  «ENDIF»
                </hashTree>
              «ENDFOR»
              </hashTree>
              </hashTree>
            «ENDFOR»
            «IF(report.summary == true)»
              <ResultCollector guiclass="StatVisualizer" testclass="ResultCollector" testname="SummaryReport" enabled="true">
                <boolProp name="ResultCollector.error_logging">false</boolProp>
                <objProp>
                  <name>saveConfig</name>
                  <value class="SampleSaveConfiguration">
                    <time>true</time>
                    <latency>true</latency>
                    <timestamp>true</timestamp>
                    <success>true</success>
                    <label>true</label>
                    <code>true</code>
                    <message>true</message>
                    <threadName>true</threadName>
                    <dataType>true</dataType>
                    <encoding>false</encoding>
                    <assertions>true</assertions>
                    <subresults>true</subresults>
                    <responseData>false</responseData>
                    <samplerData>false</samplerData>
                    <xml>false</xml>
                    <fieldNames>false</fieldNames>
                    <responseHeaders>false</responseHeaders>
                    <requestHeaders>false</requestHeaders>
                    <responseDataOnError>false</responseDataOnError>
                    <saveAssertionResultsFailureMessage>false</saveAssertionResultsFailureMessage>
                    <assertionsResultsToSave>0</assertionsResultsToSave>
                    <bytes>true</bytes>
                    <threadCounts>true</threadCounts>
                  </value>
                </objProp>
                <stringProp name="filename"></stringProp>
              </ResultCollector>
              <hashTree/>
            «ENDIF»
            «IF(report.hps)»
              <kg.apc.jmeter.vizualizers.CorrectedResultCollector guiclass="kg.apc.jmeter.vizualizers.HitsPerSecondGui" testclass="kg.apc.jmeter.vizualizers.CorrectedResultCollector" testname="jp@gc - Hits per Second" enabled="true">
                <boolProp name="ResultCollector.error_logging">false</boolProp>
                <objProp>
                  <name>saveConfig</name>
                  <value class="SampleSaveConfiguration">
                    <time>true</time>
                    <latency>true</latency>
                    <timestamp>true</timestamp>
                    <success>true</success>
                    <label>true</label>
                    <code>true</code>
                    <message>true</message>
                    <threadName>true</threadName>
                    <dataType>true</dataType>
                    <encoding>false</encoding>
                    <assertions>true</assertions>
                    <subresults>true</subresults>
                    <responseData>false</responseData>
                    <samplerData>false</samplerData>
                    <xml>false</xml>
                    <fieldNames>false</fieldNames>
                    <responseHeaders>false</responseHeaders>
                    <requestHeaders>false</requestHeaders>
                    <responseDataOnError>false</responseDataOnError>
                    <saveAssertionResultsFailureMessage>false</saveAssertionResultsFailureMessage>
                    <assertionsResultsToSave>0</assertionsResultsToSave>
                    <bytes>true</bytes>
                    <threadCounts>true</threadCounts>
                  </value>
                </objProp>
                <stringProp name="filename"></stringProp>
                <longProp name="interval_grouping">1000</longProp>
                <boolProp name="graph_aggregated">false</boolProp>
                <stringProp name="include_sample_labels"></stringProp>
                <stringProp name="exclude_sample_labels"></stringProp>
                <stringProp name="start_offset"></stringProp>
                <stringProp name="end_offset"></stringProp>
                <boolProp name="include_checkbox_state">false</boolProp>
                <boolProp name="exclude_checkbox_state">false</boolProp>
              </kg.apc.jmeter.vizualizers.CorrectedResultCollector>
              <hashTree/>
            «ENDIF»
            «IF(report.tps)»
              <kg.apc.jmeter.vizualizers.CorrectedResultCollector guiclass="kg.apc.jmeter.vizualizers.TransactionsPerSecondGui" testclass="kg.apc.jmeter.vizualizers.CorrectedResultCollector" testname="jp@gc - Transactions per Second" enabled="true">
                <boolProp name="ResultCollector.error_logging">false</boolProp>
                <objProp>
                  <name>saveConfig</name>
                  <value class="SampleSaveConfiguration">
                    <time>true</time>
                    <latency>true</latency>
                    <timestamp>true</timestamp>
                    <success>true</success>
                    <label>true</label>
                    <code>true</code>
                    <message>true</message>
                    <threadName>true</threadName>
                    <dataType>true</dataType>
                    <encoding>false</encoding>
                    <assertions>true</assertions>
                    <subresults>true</subresults>
                    <responseData>false</responseData>
                    <samplerData>false</samplerData>
                    <xml>false</xml>
                    <fieldNames>false</fieldNames>
                    <responseHeaders>false</responseHeaders>
                    <requestHeaders>false</requestHeaders>
                    <responseDataOnError>false</responseDataOnError>
                    <saveAssertionResultsFailureMessage>false</saveAssertionResultsFailureMessage>
                    <assertionsResultsToSave>0</assertionsResultsToSave>
                    <bytes>true</bytes>
                    <threadCounts>true</threadCounts>
                  </value>
                </objProp>
                <stringProp name="filename"></stringProp>
                <longProp name="interval_grouping">1000</longProp>
                <boolProp name="graph_aggregated">false</boolProp>
                <stringProp name="include_sample_labels"></stringProp>
                <stringProp name="exclude_sample_labels"></stringProp>
                <stringProp name="start_offset"></stringProp>
                <stringProp name="end_offset"></stringProp>
                <boolProp name="include_checkbox_state">false</boolProp>
                <boolProp name="exclude_checkbox_state">false</boolProp>
              </kg.apc.jmeter.vizualizers.CorrectedResultCollector>
              <hashTree/>
            «ENDIF»
            «IF(report.resptime)»
              <kg.apc.jmeter.vizualizers.CorrectedResultCollector guiclass="kg.apc.jmeter.vizualizers.ResponseTimesOverTimeGui" testclass="kg.apc.jmeter.vizualizers.CorrectedResultCollector" testname="jp@gc - Response Times Over Time" enabled="true">
                <boolProp name="ResultCollector.error_logging">false</boolProp>
                <objProp>
                  <name>saveConfig</name>
                  <value class="SampleSaveConfiguration">
                    <time>true</time>
                    <latency>true</latency>
                    <timestamp>true</timestamp>
                    <success>true</success>
                    <label>true</label>
                    <code>true</code>
                    <message>true</message>
                    <threadName>true</threadName>
                    <dataType>true</dataType>
                    <encoding>false</encoding>
                    <assertions>true</assertions>
                    <subresults>true</subresults>
                    <responseData>false</responseData>
                    <samplerData>false</samplerData>
                    <xml>false</xml>
                    <fieldNames>false</fieldNames>
                    <responseHeaders>false</responseHeaders>
                    <requestHeaders>false</requestHeaders>
                    <responseDataOnError>false</responseDataOnError>
                    <saveAssertionResultsFailureMessage>false</saveAssertionResultsFailureMessage>
                    <assertionsResultsToSave>0</assertionsResultsToSave>
                    <bytes>true</bytes>
                    <threadCounts>true</threadCounts>
                  </value>
                </objProp>
                <stringProp name="filename"></stringProp>
                <longProp name="interval_grouping">500</longProp>
                <boolProp name="graph_aggregated">false</boolProp>
                <stringProp name="include_sample_labels"></stringProp>
                <stringProp name="exclude_sample_labels"></stringProp>
                <stringProp name="start_offset"></stringProp>
                <stringProp name="end_offset"></stringProp>
                <boolProp name="include_checkbox_state">false</boolProp>
                <boolProp name="exclude_checkbox_state">false</boolProp>
              </kg.apc.jmeter.vizualizers.CorrectedResultCollector>
              <hashTree/>
            «ENDIF»
            «IF(report.cc)»
              <kg.apc.jmeter.vizualizers.CorrectedResultCollector guiclass="kg.apc.jmeter.vizualizers.ThreadsStateOverTimeGui" testclass="kg.apc.jmeter.vizualizers.CorrectedResultCollector" testname="jp@gc - Active Threads Over Time" enabled="true">
                <boolProp name="ResultCollector.error_logging">false</boolProp>
                <objProp>
                  <name>saveConfig</name>
                  <value class="SampleSaveConfiguration">
                    <time>true</time>
                    <latency>true</latency>
                    <timestamp>true</timestamp>
                    <success>true</success>
                    <label>true</label>
                    <code>true</code>
                    <message>true</message>
                    <threadName>true</threadName>
                    <dataType>true</dataType>
                    <encoding>false</encoding>
                    <assertions>true</assertions>
                    <subresults>true</subresults>
                    <responseData>false</responseData>
                    <samplerData>false</samplerData>
                    <xml>false</xml>
                    <fieldNames>false</fieldNames>
                    <responseHeaders>false</responseHeaders>
                    <requestHeaders>false</requestHeaders>
                    <responseDataOnError>false</responseDataOnError>
                    <saveAssertionResultsFailureMessage>false</saveAssertionResultsFailureMessage>
                    <assertionsResultsToSave>0</assertionsResultsToSave>
                    <bytes>true</bytes>
                    <threadCounts>true</threadCounts>
                  </value>
                </objProp>
                <stringProp name="filename"></stringProp>
                <longProp name="interval_grouping">500</longProp>
                <boolProp name="graph_aggregated">false</boolProp>
                <stringProp name="include_sample_labels"></stringProp>
                <stringProp name="exclude_sample_labels"></stringProp>
                <stringProp name="start_offset"></stringProp>
                <stringProp name="end_offset"></stringProp>
                <boolProp name="include_checkbox_state">false</boolProp>
                <boolProp name="exclude_checkbox_state">false</boolProp>
              </kg.apc.jmeter.vizualizers.CorrectedResultCollector>
              <hashTree/>
            «ENDIF»
            «IF(report.checkresponse)»
              <ResultCollector guiclass="ViewResultsFullVisualizer" testclass="ResultCollector" testname="Check for sampler results with treeview" enabled="true">
                <boolProp name="ResultCollector.error_logging">false</boolProp>
                <objProp>
                  <name>saveConfig</name>
                  <value class="SampleSaveConfiguration">
                    <time>true</time>
                    <latency>true</latency>
                    <timestamp>true</timestamp>
                    <success>true</success>
                    <label>true</label>
                    <code>true</code>
                    <message>true</message>
                    <threadName>true</threadName>
                    <dataType>true</dataType>
                    <encoding>false</encoding>
                    <assertions>true</assertions>
                    <subresults>true</subresults>
                    <responseData>false</responseData>
                    <samplerData>false</samplerData>
                    <xml>false</xml>
                    <fieldNames>false</fieldNames>
                    <responseHeaders>false</responseHeaders>
                    <requestHeaders>false</requestHeaders>
                    <responseDataOnError>false</responseDataOnError>
                    <saveAssertionResultsFailureMessage>false</saveAssertionResultsFailureMessage>
                    <assertionsResultsToSave>0</assertionsResultsToSave>
                    <bytes>true</bytes>
                    <threadCounts>true</threadCounts>
                  </value>
                </objProp>
                <stringProp name="filename"></stringProp>
              </ResultCollector>
              <hashTree/>
            «ENDIF»
            «IF report.resultpath != ""»
              <ResultCollector guiclass="SimpleDataWriter" testclass="ResultCollector" testname="SimpleDataWriter" enabled="true">
                <boolProp name="ResultCollector.error_logging">false</boolProp>
                <objProp>
                  <name>saveConfig</name>
                  <value class="SampleSaveConfiguration">
                    <time>true</time>
                    <latency>true</latency>
                    <timestamp>true</timestamp>
                    <success>true</success>
                    <label>true</label>
                    <code>true</code>
                    <message>true</message>
                    <threadName>true</threadName>
                    <dataType>true</dataType>
                    <encoding>true</encoding>
                    <assertions>true</assertions>
                    <subresults>true</subresults>
                    <responseData>false</responseData>
                    <samplerData>false</samplerData>
                    <xml>false</xml>
                    <fieldNames>true</fieldNames>
                    <responseHeaders>false</responseHeaders>
                    <requestHeaders>false</requestHeaders>
                    <responseDataOnError>false</responseDataOnError>
                    <saveAssertionResultsFailureMessage>true</saveAssertionResultsFailureMessage>
                    <assertionsResultsToSave>0</assertionsResultsToSave>
                    <bytes>true</bytes>
                    <url>true</url>
                    <fileName>true</fileName>
                    <hostname>true</hostname>
                    <threadCounts>true</threadCounts>
                    <sampleCount>true</sampleCount>
                    <idleTime>true</idleTime>
                    <connectTime>true</connectTime>
                  </value>
                </objProp>
                <stringProp name="filename">«report.resultpath»</stringProp>
              </ResultCollector>
            «ENDIF»
            </hashTree>
          </hashTree>
        </jmeterTestPlan>
        '''
    }

    //String extension
    def splitaslist(String target, String separate){
        if(target == null || separate == null || separate == "" ){
            throw new IllegalArgumentException()
        } else{
            target.split(separate).toList
        }
    }
    
    def toXmlentity(String target){
        target.toCharArray.map[
            e|switch(e){
                case "\"":"&quot;"
                case "<":"&lt;"
                case ">":"&gt;"
            }
        ]
    }
    def createFolder(String target){
        var folder = new File(target)
        if(!folder.exists){folder.mkdir}
    }
    
    def instantiate(SHAREMODE sharemode){
        var s = switch(sharemode) {
            case SHAREMODE.ALLTHREAD:"shareMode.all"
            default:"shareMode.all"
        }
        s
    }
    def instantiate(ENCODINGTYPE enctype){
        var e = switch(enctype) {
            case ENCODINGTYPE.UTF8:"utf-8"
            default:"utf-8"
        }
        e
    }
}