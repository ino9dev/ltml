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

//    def void mainTest(){
//        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap( ).put("ltml",resourceFactory);
//        var resourceSet = new ResourceSetImpl()
//        var uri = URI.createFileURI("src/ltml/tests/test.ltml")
//        var resource = resourceSet.getResource(uri, true);
//        var model = resource.getContents().get(0) as Model;
//        var injector = new LtmlStandaloneSetup().createInjectorAndDoEMFRegistration();
//        var rs = new ResourceSetImpl();
//        var resource = rs.getResource(URI.createURI("src/ltml/tests/test.ltml"), true);
//        var model = resource.getContents().get(0) as Model
//    }
 
    @Test
    def void generatorTest1(){
        val model = parseHelper.parse('''
        Manifest {
            Id manifest01
            Name "SYSTEM A Load Test Plan"
            Version "1.0"
            InstanceType JMeter
            ModelInstancedPath "C:\\temp\\senarios\\case1\\"
            Corpname "LOADSTAR.CO.LTD"
        }

        //Testcase 1
        LoadTest {
            Id case1
            LoadGroups LG01
            Report {
                NoReport
            }
        }
        //Testcase 2
        LoadTest {
            Id case2
            LoadGroups LG01
            Report {
                Summary
            }
        }

        //Testcase 3
        //result path need escape for pathchar(\ is incorrect.\\ is correct.)
        LoadTest {
            Id case3
            LoadGroups LG03
            Report {
                Summary
                Result "C:\\temp\\gege.csv"
            }
        }

        //Testcase 4
        LoadTest {
            Id case4
            LoadGroups LG01
            Report {
                Summary     
                ResponseTime
                HitPerSecond
                TransactionPerSecond
                ConccurentCount
            }
        }
        
        LoadGroup {
            Id LG01
            Cc 20
            Script BP01
            Iteration "INFINITY"
            LoadGenerator LGen01
            RampUp "20/1min"
        }

        LoadGroup {
            Id LG02
            Cc 40
            Script BP01
            Iteration "INFINITY"
            LoadGenerator LGen01
            RampUp "20/1min"
            Schedule {
                Start "2015/01/04 00:00:09"
                End "2015/01/05 00:00:10"
            }
        }

        LoadGroup {
            Id LG03
            Cc 10
            Script BP03
            Iteration "INFINITY"
            LoadGenerator LGen01
            RampUp "20/1min"
        }

        LoadGenerator {
            Id LGen01
            TargetIp "192.168.0.5"
            TargetPort "1008"
            Location "America"
            AuthUsername "test001"
            AuthPassword "test001"
        }

        Script {
            Id BP01
            Name "BusinessProcess01"
            Trs {
                Tr {
                    Id BP01_01
                    Name "BP01_01"
                    No 001
                    Method GET
                    URL "http://localhost/test1"
                    CaptureFileName "image001"
                }
                Tr {
                    Id BP01_02
                    Name "BP01_02"
                    No 002
                    Method GET
                    URL "http://localhost/test2"
                    CaptureFileName "image002"
                }
            }
        }

        Script {
            Id BP02
            Name "BusinessProcess02"
            Trs {
                Tr {
                    Id BP02_01
                    Name "BP02_01"
                    No 201
                    Method GET
                    URL "http://localhost/test1"
                    CaptureFileName "image001"
                }
                Tr {
                    Id BP02_01
                    Name "BP02_01"
                    No 202
                    Method POST
                    URL "http://localhost/test2"
                    Body a=asvalue&b=bsvalue
                    CaptureFileName "image002"
                }
            }
        }

        Script {
            Id BP03
            Name "BusinessProcess03"
            Trs {
                Tr {
                    Id BP03_01
                    Name "BP03_01"
                    No 002
                    Method GET
                    URL "http://localhost/test/"
                    CaptureFileName "image001"
                }
            }
        }

        ''')

        /*
        Parameter {
            Name account
            Type CSVFILE
            Layout id,pass
            File "hoge.csv"
        }
        Reports {
            Summary
            TransactionsPerSecond
            HitPerSecond
            ResponseTimeOverTime
            ConccurentCountOverTime
        }        
         */
        
        //val fsa = new InMemoryFileSystemAccess()
        //fsa.setOutputConfigurations(newHashMap(""->new OutputConfiguration(IFileSystemAccess::DEFAULT_OUTPUT)))
        //underTest.doGenerate(model.eResource, fsa)
        
        val fsa = new JavaIoFileSystemAccess()

        //fsa.setOutputPath(".")
        Guice::createInjector(new GenericModule).injectMembers(fsa)
        underTest.doGenerate(model.eResource, fsa)
    }
    
    @Test
    def void testCase2(){
        var model = parseHelper.parse(
        '''
        Manifest {
            Id testcase1
            Version "1.0"
            InstanceType JMeter
            ModelInstancedPath "C:\\temp\\case2\\senarios"
        }
        
        //Testcase 1
        LoadTest {
            Id lt001
            LoadGroups LG01
            Report {
               Summary
               Result "C:\\temp\\results\\report_result.csv"
               HitPerSecond
               TransactionPerSecond
            }
        }
        
        LoadGroup {
            Id LG01
            Cc 20
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
            Location "America"
            AuthUsername "test001"
            AuthPassword "test001"
        }
        
        Script {
            Id BP01
            Name "BusinessProcess01"
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
                        "ka"="va"
                        "kb"="vb"
                    ]
                    CaptureFileName "C:\\temp\\result\\image002"
                }
            }
        }
        '''   
        )
        val fsa = new JavaIoFileSystemAccess()
        Guice::createInjector(new GenericModule).injectMembers(fsa)
        underTest.doGenerate(model.eResource, fsa)
    }
}
