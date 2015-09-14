package com.ino9dev.interpreter;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.ino9dev.LtmlStandaloneSetup;
import com.ino9dev.interpreter.Mode;
import com.ino9dev.invoker.JMeterRuntimeInvoker;
import com.ino9dev.ltml.impl.ManifestImpl;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.util.StringInputStream;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class LtmlInterpreter {
  @Inject
  private JMeterRuntimeInvoker invoker;
  
  public static void main(final String[] args) {
    Injector injector = Guice.createInjector();
    LtmlInterpreter interpreter = injector.<LtmlInterpreter>getInstance(LtmlInterpreter.class);
    interpreter.main();
  }
  
  public String main() {
    String _xblockexpression = null;
    {
      LtmlStandaloneSetup _ltmlStandaloneSetup = new LtmlStandaloneSetup();
      Injector guiceInjector = _ltmlStandaloneSetup.createInjectorAndDoEMFRegistration();
      IParser parser = guiceInjector.<IParser>getInstance(IParser.class);
      Scanner _scanner = new Scanner(System.in);
      String _property = System.getProperty("line.separator");
      String _property_1 = System.getProperty("line.separator");
      String _plus = (_property + _property_1);
      Scanner scannar = _scanner.useDelimiter(_plus);
      StringBuffer _stringBuffer = new StringBuffer();
      StringBuffer input = _stringBuffer;
      Mode status = Mode.Define;
      IParseResult parseresult = null;
      ArrayList<EObject> memory = CollectionLiterals.<EObject>newArrayList();
      boolean _or = false;
      boolean _equals = input.equals("quit");
      if (_equals) {
        _or = true;
      } else {
        boolean _equals_1 = input.equals("exit");
        _or = (_equals || _equals_1);
      }
      boolean _not = (!_or);
      boolean _while = _not;
      while (_while) {
        {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("[ltml][Mode=");
          _builder.append(status, "");
          _builder.append("]$");
          InputOutput.<String>print(_builder.toString());
          String _next = scannar.next();
          input.append(_next);
          String _string = input.toString();
          boolean _equals_2 = _string.equals("Run");
          if (_equals_2) {
            status = Mode.Run;
          } else {
            String _string_1 = input.toString();
            boolean _equals_3 = _string_1.equals("Define");
            if (_equals_3) {
              status = Mode.Define;
            } else {
              String _string_2 = input.toString();
              boolean _equals_4 = _string_2.equals("Show");
              if (_equals_4) {
                final Procedure1<EObject> _function = new Procedure1<EObject>() {
                  public void apply(final EObject e) {
                    InputOutput.<EObject>println(e);
                  }
                };
                IterableExtensions.<EObject>forEach(memory, _function);
              } else {
                boolean _matched = false;
                if (!_matched) {
                  if (Objects.equal(status,Mode.Run)) {
                    _matched=true;
                    this.invoker.invoke();
                    InputOutput.<String>println("todo execution parse");
                  }
                }
                if (!_matched) {
                  if (Objects.equal(status,Mode.Define)) {
                    _matched=true;
                    String _string_3 = input.toString();
                    StringInputStream _stringInputStream = new StringInputStream(_string_3);
                    InputStreamReader _inputStreamReader = new InputStreamReader(_stringInputStream);
                    IParseResult _parse = parser.parse(_inputStreamReader);
                    parseresult = _parse;
                    Iterable<INode> errors = parseresult.getSyntaxErrors();
                    final Iterable<INode> _converted_errors = (Iterable<INode>)errors;
                    int _length = ((Object[])Conversions.unwrapArray(_converted_errors, Object.class)).length;
                    boolean _notEquals = (_length != 0);
                    if (_notEquals) {
                      InputOutput.<String>println("Syntax error occurred.");
                    } else {
                      EObject _rootASTElement = parseresult.getRootASTElement();
                      InputOutput.<EObject>println(_rootASTElement);
                      CollectionExtensions.<EObject>removeAll(memory);
                      EObject _rootASTElement_1 = parseresult.getRootASTElement();
                      EList<EObject> _eContents = _rootASTElement_1.eContents();
                      memory.addAll(_eContents);
                      EObject _rootASTElement_2 = parseresult.getRootASTElement();
                      TreeIterator<EObject> _eAllContents = _rootASTElement_2.eAllContents();
                      Iterator<ManifestImpl> _filter = Iterators.<ManifestImpl>filter(_eAllContents, ManifestImpl.class);
                      final ManifestImpl manifest = IteratorExtensions.<ManifestImpl>head(_filter);
                      String _name = manifest.getName();
                      InputOutput.<String>println(_name);
                    }
                  }
                }
              }
            }
          }
          StringBuffer _stringBuffer_1 = new StringBuffer();
          input = _stringBuffer_1;
        }
        boolean _or_1 = false;
        boolean _equals_2 = input.equals("quit");
        if (_equals_2) {
          _or_1 = true;
        } else {
          boolean _equals_3 = input.equals("exit");
          _or_1 = (_equals_2 || _equals_3);
        }
        boolean _not_1 = (!_or_1);
        _while = _not_1;
      }
      String _println = InputOutput.<String>println("Bye");
      _xblockexpression = (_println);
    }
    return _xblockexpression;
  }
}
