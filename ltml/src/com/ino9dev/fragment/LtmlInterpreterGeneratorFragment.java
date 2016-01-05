/*******************************************************************************
 * Copyright (c) 2015 ino9dev
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package com.ino9dev.fragment;

import static com.google.common.collect.Lists.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.generator.AbstractGeneratorFragment;
import org.eclipse.xtext.generator.BindFactory;
import org.eclipse.xtext.generator.Binding;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.IGeneratorFragment;
import org.eclipse.xtext.generator.IStubGenerating;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.generator.Naming;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.generator.junit.Junit4Fragment;
import org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.parser.antlr.IPartialParsingHelper;
import org.eclipse.xtext.parser.impl.PartialParsingHelper;
import org.eclipse.xtext.service.AbstractGenericModule;
import org.eclipse.xtext.util.Strings;

import com.google.inject.Guice;
import com.ino9dev.generator.LtmlInterpreterGenerator;
import com.ino9dev.ltml.impl.LtmlFactoryImpl;
import com.ino9dev.parser.antlr.LtmlParser;

public class LtmlInterpreterGeneratorFragment implements IGeneratorFragment {
 
    private static final Logger log = Logger.getLogger(LtmlInterpreterGeneratorFragment.class);

    private Naming naming;
    private Outlet outlet;
    private IGenerator generator;
    private IFileSystemAccess fsa;

    public void setGenerator(IGenerator generator){
        this.generator = generator;
    }
    public void setFsa(IFileSystemAccess fsa){
        this.fsa = fsa;
    }
    
    public void registerNaming(Naming naming) {
        this.naming = naming;
    }

    public Naming getNaming() {
        return naming;
    }

    protected String getTemplate() {
        return getClass().getName().replaceAll("\\.", "::");
    }
    
    protected List<Object> getParameters(Grammar grammar) {
        return Collections.emptyList();
    }
    
    public void checkConfiguration(Issues issues) {
        // TODO Auto-generated method stub
        
    }

    public void generate(Grammar grammar, XpandExecutionContext ctx) {
        //not to use xpand
        //ctx.getOutput().addOutlet(this.outlet);
        //XpandFacade.create(ctx).evaluate2(getTemplate() + "::generate", grammar, getParameters(grammar));
        
        if (log.isInfoEnabled()) {
            log.info("Generating Ltml Interpreter");
        }
        //for encoding provider
        Guice.createInjector(new AbstractGenericModule() {
            public Class<? extends IEncodingProvider> bindIEncodingProvider() {
                return IEncodingProvider.Runtime.class;
            }
        }).injectMembers(this.fsa);
        //memo is this antipattern?
        this.generator.doGenerate(LtmlFactoryImpl.eINSTANCE.createModel().eResource(),this.fsa);
    }

    public void addToStandaloneSetup(Grammar grammar, XpandExecutionContext ctx) {
        // TODO Auto-generated method stub
        
    }

    public void addToPluginXmlRt(Grammar grammar, XpandExecutionContext ctx) {
        // TODO Auto-generated method stub
        
    }

    public void addToPluginXmlUi(Grammar grammar, XpandExecutionContext ctx) {
        // TODO Auto-generated method stub
        
    }

    public Set<Binding> getGuiceBindingsRt(Grammar grammar) {
        // TODO Auto-generated method stub
        return null;
    }

    public Set<Binding> getGuiceBindingsUi(Grammar grammar) {
        // TODO Auto-generated method stub
        return null;
    }

    public String[] getRequiredBundlesRt(Grammar grammar) {
        // TODO Auto-generated method stub
        return null;
    }

    public String[] getExportedPackagesRt(Grammar grammar) {
        // TODO Auto-generated method stub
        return null;
    }

    public String[] getImportedPackagesRt(Grammar grammar) {
        // TODO Auto-generated method stub
        return null;
    }

    public String[] getRequiredBundlesUi(Grammar grammar) {
        // TODO Auto-generated method stub
        return null;
    }

    public String[] getExportedPackagesUi(Grammar grammar) {
        // TODO Auto-generated method stub
        return null;
    }

    public String[] getImportedPackagesUi(Grammar grammar) {
        // TODO Auto-generated method stub
        return null;
    }
	public void setOutlet(String path){
        this.outlet = new Outlet(path);	    
	}
}
