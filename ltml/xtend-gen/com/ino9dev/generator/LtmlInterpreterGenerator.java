package com.ino9dev.generator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractFileSystemAccess;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

@SuppressWarnings("all")
public class LtmlInterpreterGenerator implements IGenerator {
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    AbstractFileSystemAccess afsa = ((AbstractFileSystemAccess) fsa);
    afsa.setOutputPath("C:\\Users\\oni\\git\\ltml\\ltml\\src\\com\\ino9dev\\interpreter");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package com.ino9dev.interpreter;");
    _builder.newLine();
    _builder.append("import com.ino9dev.LtmlStandaloneSetup;");
    _builder.newLine();
    _builder.append("import com.ino9dev.ltml.impl.ManifestImpl;");
    _builder.newLine();
    _builder.append("import com.ino9dev.ltml.impl.LoadTestImpl;");
    _builder.newLine();
    _builder.append("import com.ino9dev.ltml.impl.RunImpl;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.io.InputStreamReader;");
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import java.util.HashMap;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("import java.util.Map;");
    _builder.newLine();
    _builder.append("import java.util.Scanner;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.EObject;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.nodemodel.INode;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.parser.IParser;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.util.StringInputStream;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.parser.IParseResult;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.parser.ParseResult;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import com.google.inject.Inject;");
    _builder.newLine();
    _builder.append("import com.ino9dev.invoker.JMeterRuntimeInvoker;");
    _builder.newLine();
    _builder.append("import com.google.inject.Guice;");
    _builder.newLine();
    _builder.append("import com.google.inject.Injector;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("enum Mode {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Run,");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Define");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class LtmlInterpreter {");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Inject JMeterRuntimeInvoker invoker;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static void main(String[] args){");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Injector injector = Guice.createInjector();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("LtmlInterpreter interpreter = injector.getInstance(LtmlInterpreter.class);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("interpreter.main();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void main(){");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Injector guiceInjector = new LtmlStandaloneSetup().createInjectorAndDoEMFRegistration();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("IParser parser = guiceInjector.getInstance(IParser.class);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Scanner scannar = new Scanner(System.in).useDelimiter(System.getProperty(\"line.separator\")+System.getProperty(\"line.separator\")); //[\\r\\n\\r\\n|\\n\\n]");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("StringBuffer input = new StringBuffer();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Mode status = Mode.Define;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("IParseResult parseresult = null;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("//simulation for memory space ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Map<String,EObject> memory = new HashMap<String,EObject>();");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("while(!(input.equals(\"quit\") || input.equals(\"exit\"))) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("System.out.printf(\"[ltml][Mode=%s]$\",status);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("input.append(scannar.next());");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("if(input.toString().equals(\"Mode Run\")){status = Mode.Run;}");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("else if(input.toString().equals(\"Mode Define\")){status = Mode.Define;}");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("else if(input.toString().equals(\"Show Defines\")){");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("for(String key : memory.keySet()){");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("System.out.println(memory.get(key));");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("else{");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("switch(status){");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("//load test run mode");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("case Run:");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("{");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("//to get Run syntax ");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("parseresult = parser.parse(new InputStreamReader(new StringInputStream(input.toString())));");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("Iterable<INode> errors = parseresult.getSyntaxErrors();");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("//has Parse Error");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("if(errors.iterator().hasNext()){");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("System.out.println(\"Syntax error occurred.\");");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("}else {");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("//エラーがなければ、parseして取り出す");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("//IParseResult run = parseresult.rootASTElement.eAllContents.filter(typeof(RunImpl)).head");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("//load test define mode");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("case Define:");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("{");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("parseresult = parser.parse(new InputStreamReader(new StringInputStream(input.toString())));");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("//todo to check parse result");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("Iterable<INode> errors = parseresult.getSyntaxErrors();");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("//has Parse Error");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("if(errors.iterator().hasNext() || parseresult.getRootASTElement() == null){");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("System.out.println(\"Syntax error occurred.\");");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("}else {");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("System.out.println(parseresult.getRootASTElement());");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("for(EObject e:parseresult.getRootASTElement().eContents()){");
    _builder.newLine();
    _builder.append("                                ");
    _builder.append("if(e instanceof ManifestImpl){");
    _builder.newLine();
    _builder.append("                                    ");
    _builder.append("ManifestImpl m = (ManifestImpl) e;");
    _builder.newLine();
    _builder.append("                                    ");
    _builder.append("memory.put(m.getName(), e);");
    _builder.newLine();
    _builder.append("                                ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("//val manifest = parseresult.rootASTElement.eAllContents.filter(typeof(ManifestImpl)).head");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("//println(manifest.name)");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("//todo to save on memory");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("//todo to load from file");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("//todo to move syntax define Mode");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("input = new StringBuffer();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("System.out.println(\"Bye\");");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    afsa.generateFile(
      "LtmlInterpreter.java", _builder);
  }
}
