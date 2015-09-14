package com.ino9dev.invoker;

import com.ino9dev.invoker.RuntimeInvoker;
import java.io.FileInputStream;
import org.apache.jmeter.engine.StandardJMeterEngine;
import org.apache.jmeter.save.SaveService;
import org.apache.jmeter.util.JMeterUtils;
import org.apache.jorphan.collections.HashTree;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class JMeterRuntimeInvoker implements RuntimeInvoker {
  public void invoke() {
    try {
      StandardJMeterEngine _standardJMeterEngine = new StandardJMeterEngine();
      final StandardJMeterEngine jmeter = _standardJMeterEngine;
      final String JMETER_HOME = "C:\\apache-jmeter-2.13\\";
      String _plus = (JMETER_HOME + "bin\\jmeter.properties");
      JMeterUtils.loadJMeterProperties(_plus);
      JMeterUtils.setJMeterHome(JMETER_HOME);
      JMeterUtils.initLogging();
      JMeterUtils.initLocale();
      SaveService.loadProperties();
      String _plus_1 = (JMETER_HOME + "bin\\test.jmx");
      FileInputStream _fileInputStream = new FileInputStream(_plus_1);
      FileInputStream in = _fileInputStream;
      HashTree testPlanTree = SaveService.loadTree(in);
      in.close();
      jmeter.configure(testPlanTree);
      jmeter.run();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
