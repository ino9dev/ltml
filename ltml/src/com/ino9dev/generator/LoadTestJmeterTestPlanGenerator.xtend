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

class LoadTestJmeterTestPlanGenerator implements IGenerator {
    
    override doGenerate(Resource resource, IFileSystemAccess fsa) {

        //to get manifest object
        val manifest = resource.allContents.filter(typeof(ManifestImpl)).head
        
        //to get report object
        val report = resource.allContents.filter(typeof(ReportImpl))

        //to get loadtest(s) object
        val loadtests = resource.allContents.filter(typeof(LoadTestImpl))
        
        loadtests.forEach[
            loadtest|
            fsa.generateFile(
               '''«manifest.name»_ver_«manifest.version»_«loadtest.name».jmx''',
               //to JmeterTestPlan
               toJmeterTestPlan(
                   manifest,
                   loadtest
               )
            )
        ]
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
            «FOR lg:loadtest.loadgroups»
            «var schedule = if(loadtest.schedule != null){loadtest.schedule}else{lg.schedule}»
            «println(lg.rampup)»
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
                <longProp name="ThreadGroup.start_time">«schedule.start»</longProp>
                <longProp name="ThreadGroup.end_time">«schedule.end»</longProp>
                <stringProp name="ThreadGroup.duration">«schedule.duration»</stringProp>
                <stringProp name="ThreadGroup.delay">«schedule.delay»</stringProp>
              </ThreadGroup>
              <hashTree>
              «var transactions = lg.script.transactions»
              «FOR t:transactions»
              «var protocol=t.url.split("://").get(0)»
              «var domain=t.url.split("://").get(1).split("/").get(0)»
              «var path=t.url.split("://").get(1).split("/").drop(0).reduce([e1,e2|e1+e2])»
                <TransactionController guiclass="TransactionControllerGui" testclass="TransactionController" testname="«t.name»" enabled="true">
                  <boolProp name="TransactionController.includeTimers">false</boolProp>
                  <boolProp name="TransactionController.parent">false</boolProp>
                </TransactionController>
                <hashTree>
                  <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="«t.name»" enabled="true">
                    <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" testname="userdefinedvariable" enabled="true">
                      <collectionProp name="Arguments.arguments"/>
                    </elementProp>
                    <stringProp name="HTTPSampler.domain">«domain»</stringProp>
                    <stringProp name="HTTPSampler.port">80</stringProp>
                    <stringProp name="HTTPSampler.connect_timeout"></stringProp>
                    <stringProp name="HTTPSampler.response_timeout"></stringProp>
                    <stringProp name="HTTPSampler.protocol">«protocol»</stringProp>
                    <stringProp name="HTTPSampler.contentEncoding"></stringProp>
                    <stringProp name="HTTPSampler.path">«path»</stringProp>
                    <stringProp name="HTTPSampler.method">«t.method»</stringProp>
                    <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
                    <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
                    <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
                    <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
                    <boolProp name="HTTPSampler.monitor">false</boolProp>
                    <stringProp name="HTTPSampler.embedded_url_re"></stringProp>
                  </HTTPSamplerProxy>
                  <hashTree/>
                </hashTree>
              «ENDFOR»
              </hashTree>
            </hashTree>
            «ENDFOR»


          </hashTree>
        </jmeterTestPlan>
        '''
    }

    /*
     * 
     *       <ResultCollector guiclass="StatVisualizer" testclass="ResultCollector" testname="統計レポート" enabled="true">
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
     * 
     * 
     */
    //util
    def splitaslist(String target, String separate){
        if(separate == null || separate == ""){
            throw new IllegalArgumentException()
        } else{
            target.split(separate).toList
        }
    }
}