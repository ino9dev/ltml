package ltml.tests;

import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.service.AbstractGenericModule;

@SuppressWarnings("all")
public class EncodingProviderModule extends AbstractGenericModule {
  public Class<? extends IEncodingProvider> bindIEncodingProvider() {
    return org.eclipse.xtext.parser.IEncodingProvider.Runtime.class;
  }
}
