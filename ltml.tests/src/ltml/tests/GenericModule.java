package ltml.tests;

import org.eclipse.xtext.parser.IEncodingProvider;

public class GenericModule extends org.eclipse.xtext.service.AbstractGenericModule{
        public Class<? extends IEncodingProvider> bindIEncodingProvider() {
            return IEncodingProvider.Runtime.class;
        }
}
