package com.ino9dev.interpreter;
import com.ino9dev.LtmlStandaloneSetup;
import com.ino9dev.ltml.impl.ManifestImpl;
import com.ino9dev.ltml.impl.LoadTestImpl;
import com.ino9dev.ltml.impl.RunImpl;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.util.StringInputStream;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.ParseResult;

import com.google.inject.Inject;
import com.ino9dev.invoker.JMeterRuntimeInvoker;
import com.google.inject.Guice;
import com.google.inject.Injector;

enum Mode {
    Run,
    Define
}

public class LtmlInterpreter {
    
    @Inject JMeterRuntimeInvoker invoker;

    public static void main(String[] args){
        Injector injector = Guice.createInjector();
        LtmlInterpreter interpreter = injector.getInstance(LtmlInterpreter.class);
        interpreter.main();
    }
    
    public void main(){
        Injector guiceInjector = new LtmlStandaloneSetup().createInjectorAndDoEMFRegistration();
        IParser parser = guiceInjector.getInstance(IParser.class);
        Scanner scannar = new Scanner(System.in).useDelimiter(System.getProperty("line.separator")+System.getProperty("line.separator")); //[\r\n\r\n|\n\n]
        StringBuffer input = new StringBuffer();
        Mode status = Mode.Define;
        IParseResult parseresult = null;

        //simulation for memory space 
        Map<String,EObject> memory = new HashMap<String,EObject>();
        
        while(!(input.equals("quit") || input.equals("exit"))) {
            System.out.printf("[ltml][Mode=%s]$",status);
            input.append(scannar.next());
            if(input.toString().equals("Mode Run")){status = Mode.Run;}
            else if(input.toString().equals("Mode Define")){status = Mode.Define;}
            else if(input.toString().equals("Show Defines")){
                for(String key : memory.keySet()){
                    System.out.println(memory.get(key));
                }
            }
            else{
                switch(status){
                    //load test run mode
                    case Run:
                    {
                        //to get Run syntax 
                        parseresult = parser.parse(new InputStreamReader(new StringInputStream(input.toString())));
                        Iterable<INode> errors = parseresult.getSyntaxErrors();
                        //has Parse Error
                        if(errors.iterator().hasNext()){
                            System.out.println("Syntax error occurred.");
                        }else {
                            //エラーがなければ、parseして取り出す
                            //IParseResult run = parseresult.rootASTElement.eAllContents.filter(typeof(RunImpl)).head
                        }
                    }
                    //load test define mode
                    case Define:
                    {
                        parseresult = parser.parse(new InputStreamReader(new StringInputStream(input.toString())));
                        //todo to check parse result
                        Iterable<INode> errors = parseresult.getSyntaxErrors();
                        //has Parse Error
                        if(errors.iterator().hasNext() || parseresult.getRootASTElement() == null){
                            System.out.println("Syntax error occurred.");
                        }else {
                            System.out.println(parseresult.getRootASTElement());
                            for(EObject e:parseresult.getRootASTElement().eContents()){
                                if(e instanceof ManifestImpl){
                                    ManifestImpl m = (ManifestImpl) e;
                                    memory.put(m.getName(), e);
                                }
                            }
                            //val manifest = parseresult.rootASTElement.eAllContents.filter(typeof(ManifestImpl)).head
                            //println(manifest.name)
                            //todo to save on memory
                            //todo to load from file
                        }
                        //todo to move syntax define Mode
                    }
                }
            }
            input = new StringBuffer();
        }
        System.out.println("Bye");
    }
}
