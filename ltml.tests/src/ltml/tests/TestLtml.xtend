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

    def void mainTest(){
//        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap( ).put("ltml",resourceFactory);
//        var resourceSet = new ResourceSetImpl()
//        var uri = URI.createFileURI("src/ltml/tests/test.ltml")
//        var resource = resourceSet.getResource(uri, true);
//        var model = resource.getContents().get(0) as Model;

        var injector = new LtmlStandaloneSetup().createInjectorAndDoEMFRegistration();
        var rs = new ResourceSetImpl();
        var resource = rs.getResource(URI.createURI("src/ltml/tests/test.ltml"), true);
        var model = resource.getContents().get(0) as Model

    }
    
    @Test
    def void generatorTest1(){
        val model = parseHelper.parse('''
        Manifest {
            Id lt20150801
            Version "1.0"
        }
        
        //Testcase 1
        LoadTest {
            Id lt001
            LoadGroups LG01
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
            Name "業務A"
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
            Name "業務B"
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
        Reports {
            Summary
            TransactionsPerSecond
            HitPerSecond
            ResponseTimeOverTime
            ConccurentCountOverTime
        }
        ''')
        
        /*
        Parameter {
            Name account
            Type CSVFILE
            Layout id,pass
            File "hoge.csv"
        }
        
         */
        
        //val fsa = new InMemoryFileSystemAccess()
        val fsa = new JavaIoFileSystemAccess()
        //fsa.setOutputConfigurations(newHashMap(""->new OutputConfiguration(IFileSystemAccess::DEFAULT_OUTPUT)))
        fsa.setOutputPath("C:\\apache-jmeter-2.13\\bin");
        Guice::createInjector(new GenericModule).injectMembers(fsa);
        underTest.doGenerate(model.eResource, fsa)

//        println(fsa.getAllFiles)
//        assertEquals(2,fsa.getAllFiles.size)
//        assertTrue(fsa.getAllFiles.containsKey(IFileSystemAccess::DEFAULT_OUTPUT+"Alice.java"))
//        assertEquals(
//            '''
//            public class Alice {
//                 
//            }
//            '''.toString, fsa.getAllFiles.get(IFileSystemAccess::DEFAULT_OUTPUT+"Alice.java").toString
//        )
//        assertTrue(fsa.getAllFiles.containsKey(IFileSystemAccess::DEFAULT_OUTPUT+"Bob.java"))
//        assertEquals(
//            '''
//            public class Bob {
//                 
//            }
//            '''.toString, fsa.getAllFiles.get(IFileSystemAccess::DEFAULT_OUTPUT+"Bob.java").toString)
    
        }
}
