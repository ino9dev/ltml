package ltml.tests

import com.google.inject.Inject
import org.junit.Test
import org.eclipse.xtext.generator.IGenerator
import com.google.inject.Injector
import com.google.inject.Guice
import com.google.inject.AbstractModule
import com.ino9dev.generator.LtmlInterpreterGenerator
import com.ino9dev.LtmlStandaloneSetup
import com.ino9dev.ltml.impl.LtmlFactoryImpl
import org.eclipse.xtext.generator.JavaIoFileSystemAccess
import org.eclipse.xtext.generator.AbstractFileSystemAccess2
import org.eclipse.xtext.service.AbstractGenericModule
import org.eclipse.xtext.parser.IEncodingProvider
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.OutputConfiguration

/**
 * bind rules
 */
class ConfigureModule extends AbstractModule {
    @Override
    override void configure() {
        bind(IGenerator).to(LtmlInterpreterGenerator)
        bind(IFileSystemAccess).to(JavaIoFileSystemAccess)
    }
}

class EncodingProviderModule extends AbstractGenericModule {
    def Class<? extends IEncodingProvider> bindIEncodingProvider() {
        return IEncodingProvider.Runtime
    }
}

class TestLtmlInterpreter {
    @Test
    def void testLtmlInterpreter01(){
        //var interpreter = Guice.createInjector(new ConfigureModule).getInstance(TestLtmlInterpreter)
        var generator = new LtmlInterpreterGenerator
        var fsa = Guice.createInjector(new EncodingProviderModule).getInstance(JavaIoFileSystemAccess)
        generator.doGenerate(LtmlFactoryImpl.eINSTANCE.createModel.eResource,fsa)

        //Guice.createInjector(new EncodingProviderModule).injectMembers(interpreter.fsa);
        //interpreter.generator.doGenerate(LtmlFactoryImpl.eINSTANCE.createModel.eResource,fsa);
    }
}
