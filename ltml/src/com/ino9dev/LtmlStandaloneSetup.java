/*
* generated by Xtext
*/
package com.ino9dev;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class LtmlStandaloneSetup extends LtmlStandaloneSetupGenerated{

	public static void doSetup() {
		new LtmlStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

