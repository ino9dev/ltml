package ltml.tests;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.ino9dev.generator.LtmlInterpreterGenerator;
import com.ino9dev.ltml.Model;
import com.ino9dev.ltml.impl.LtmlFactoryImpl;
import ltml.tests.EncodingProviderModule;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.junit.Test;

@SuppressWarnings("all")
public class TestLtmlInterpreter {
  @Test
  public void testLtmlInterpreter01() {
    LtmlInterpreterGenerator _ltmlInterpreterGenerator = new LtmlInterpreterGenerator();
    LtmlInterpreterGenerator generator = _ltmlInterpreterGenerator;
    EncodingProviderModule _encodingProviderModule = new EncodingProviderModule();
    Injector _createInjector = Guice.createInjector(_encodingProviderModule);
    JavaIoFileSystemAccess fsa = _createInjector.<JavaIoFileSystemAccess>getInstance(JavaIoFileSystemAccess.class);
    Model _createModel = LtmlFactoryImpl.eINSTANCE.createModel();
    Resource _eResource = _createModel.eResource();
    generator.doGenerate(_eResource, fsa);
  }
}
