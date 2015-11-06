package ltml.tests

import org.junit.Test
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import com.ino9dev.LtmlStandaloneSetup
import com.ino9dev.ltml.Model
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import com.google.inject.Inject
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.junit4.util.ParseHelper
import static org.junit.Assert.*
import org.eclipse.xtext.generator.IFileSystemAccess
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.InjectWith
import com.ino9dev.LtmlInjectorProvider
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.generator.JavaIoFileSystemAccess
import org.eclipse.xtext.generator.OutputConfiguration
import com.google.inject.Guice
import org.eclipse.xtext.parser.IEncodingProvider
import org.eclipse.xtext.xbase.file.JavaIOFileSystemSupport

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(LtmlInjectorProvider))
class TestLtml {
    
    @Inject IGenerator underTest
    @Inject ParseHelper<Model> parseHelper 

    @Test
    def void testPrintParseHelper(){
        println(parseHelper.class.name)
    }
    
    @Test
    def void testCaseValidator(){
        var model = parseHelper.parse(
            '''
            Manifest {
                Id testcase1
                Version "1.0"
                InstanceType JMeter
                ModelInstancedPath "C:\\apache-jmeter-2.13\\bin"
            }
            '''
        )
        
        val fsa = new JavaIoFileSystemAccess()
        Guice::createInjector(new GenericModule).injectMembers(fsa)
        underTest.doGenerate(model.eResource, fsa)
    }
    @Test
    def void testCase1(){
        var model = parseHelper.parse(
        '''
        Manifest {
            Id testcase1
            Version "1.0"
            InstanceType JMeter
            ModelInstancedPath "C:\\apache-jmeter-2.13\\bin"
        }
        
        //Testcase 1
        LoadTest {
            Id lt001
            LoadGroups LG01,LG02
            Report {
               Summary
               Result "C:\\temp\\results\\report_result.csv"
               HitPerSecond
               TransactionPerSecond
               CheckResponse
            }
        }
        
        //Testcase 2
        LoadTest {
            Id lt002
            LoadGroups LG03
            Report {
               Summary
               Result "C:\\temp\\results\\report_result.csv"
               HitPerSecond
               TransactionPerSecond
               CheckResponse
            }
        }
        

        LoadGroup {
            Id LG01
            Name "BP01's Load Simulated"
            Cc 2
            Script BP01
            Iteration "INFINITY"
            LoadGenerator LGen01
            RampUp "20/1min"
            Schedule {
                Duration 500
                Delay 0
            }
        }

        LoadGroup {
            Id LG02
            Name "BP02's Load Simulated"
            Cc 3
            Script BP02
            Iteration "INFINITY"
            LoadGenerator LGen01
            RampUp "20/1min"
            Schedule {
                Duration 500
                Delay 0
            }
        }

        LoadGroup {
            Id LG03
            Name "BP03's Load Simulated"
            Cc 1
            Script BP01
            Iteration "INFINITY"
            LoadGenerator LGen01
            RampUp "20/1min"
            Schedule {
                Duration 500
                Delay 0
            }
        }

        LoadGenerator {
            Id LGen01
            TargetIp "192.168.0.5"
            TargetPort "1008"
            Region "Japan"
            AuthUsername "test001"
            AuthPassword "test001"
        }
        
        //Business Operation1(e.g search)
        Script {
            Id BP01
            Name "BP01_search"
            Trs {
                Tr {
                    Id BP01_01
                    Name "BP01_01"
                    Protocol HTTP
                    Method GET
                    Server "localhost"
                    Path "/"
                    CaptureFileName "C:\\temp\\result\\image002"
                }
                Tr {
                    Id BP01_02
                    Name "BP01_02"
                    Protocol HTTP
                    Method POST
                    Server "localhost"
                    Path "/"
                    RequestParameters [
                        "id"="${datatable1.id}"
                        "password"="${datatable.pass}"
                    ]
                    ResponseHandler {
                        Id resp1
                        Protocol HTTP
                        QueryType REGEX
                        QueryString "<input type=\"hidden\" name=\"name\" value=(.*) />"
                        Ordnial 1
                        SearchLocation BODY
                    }
                    CaptureFileName "C:\\temp\\result\\image002"
                }
            }
            DataTable datatable1
        }
        
        //Business Operation2(e.g purchase)
        Script {
            Id BP02
            Name "BP02_purchase"
            Trs {
                Tr {
                    Id BP02_01
                    Name "BP02_01"
                    Protocol HTTP
                    Method GET
                    Server "localhost"
                    Path "/"
                    CaptureFileName "C:\\temp\\result\\image002"
                }
                Tr {
                    Id BP02_02
                    Name "BP02_02"
                    Protocol HTTP
                    Method POST
                    Server "localhost"
                    Path "/"
                    Body "key=value"
                    CaptureFileName "C:\\temp\\result\\image002"
                }
            }
        }

        //DataTable
        // SourceType defines CSV or TSV or XML
        // Layout defines columns name
        // Path defines source data file path
        // AsignMode defines per ITERATION(LOOP), RANDOM, ONCE(if it gets parameter 1 record, that parameter is used every time)
        // ShareMode defines ALLTHREAD(parameter is shared by all threads), NOTSHARE
        DataTable {
            Id datatable1
            Name "Login Account Data"
            EncodingType UTF8
            Delimiter ","
            Type CSV
            Layout "id","pass"
            Path "C:\\temp\\userdata1.txt"
            AsignMode ITERATION
            ShareMode ALLTHREAD
        }
        '''
        )
        val fsa = new JavaIoFileSystemAccess()
        Guice::createInjector(new GenericModule).injectMembers(fsa)
        underTest.doGenerate(model.eResource, fsa)

//        //val fsa = new InMemoryFileSystemAccess()
//        //fsa.setOutputConfigurations(newHashMap(""->new OutputConfiguration(IFileSystemAccess::DEFAULT_OUTPUT)))
//        //underTest.doGenerate(model.eResource, fsa)
//        
//        val fsa = new JavaIoFileSystemAccess()
//
//        //fsa.setOutputPath(".")
//        Guice::createInjector(new GenericModule).injectMembers(fsa)
//        underTest.doGenerate(model.eResource, fsa)

    }
}
