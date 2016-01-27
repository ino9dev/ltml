package ltml.tests;

import com.google.inject.AbstractModule;
import com.google.inject.binder.AnnotatedBindingBuilder;
import com.ino9dev.generator.LtmlInterpreterGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;

/**
 * bind rules
 */
@SuppressWarnings("all")
public class ConfigureModule extends AbstractModule {
  @Override
  public void configure() {
    AnnotatedBindingBuilder<IGenerator> _bind = this.<IGenerator>bind(IGenerator.class);
    _bind.to(LtmlInterpreterGenerator.class);
    AnnotatedBindingBuilder<IFileSystemAccess> _bind_1 = this.<IFileSystemAccess>bind(IFileSystemAccess.class);
    _bind_1.to(JavaIoFileSystemAccess.class);
  }
}
