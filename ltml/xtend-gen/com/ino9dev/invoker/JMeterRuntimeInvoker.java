package com.ino9dev.invoker;

import com.ino9dev.invoker.RuntimeInvoker;
import com.ino9dev.ltml.LoadTest;
import com.ino9dev.ltml.Manifest;
import java.io.FileInputStream;
import org.apache.jmeter.engine.StandardJMeterEngine;
import org.apache.jmeter.save.SaveService;
import org.apache.jmeter.util.JMeterUtils;
import org.apache.jorphan.collections.HashTree;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class JMeterRuntimeInvoker implements RuntimeInvoker {
  private String _jmeterhome = "C:\\apache-jmeter-2.13\\";
  
  public String getJmeterhome() {
    return this._jmeterhome;
  }
  
  public void setJmeterhome(final String jmeterhome) {
    this._jmeterhome = jmeterhome;
  }
  
  private String _jmxpath = new Function0<String>() {
    public String apply() {
      String _jmeterhome = JMeterRuntimeInvoker.this.getJmeterhome();
      String _plus = (_jmeterhome + "bin\\test.jmx");
      return _plus;
    }
  }.apply();
  
  public String getJmxpath() {
    return this._jmxpath;
  }
  
  public void setJmxpath(final String jmxpath) {
    this._jmxpath = jmxpath;
  }
  
  private Manifest _manifest;
  
  public Manifest getManifest() {
    return this._manifest;
  }
  
  public void setManifest(final Manifest manifest) {
    this._manifest = manifest;
  }
  
  private LoadTest _loadtest;
  
  public LoadTest getLoadtest() {
    return this._loadtest;
  }
  
  public void setLoadtest(final LoadTest loadtest) {
    this._loadtest = loadtest;
  }
  
  public void invoke() {
    try {
      StandardJMeterEngine _standardJMeterEngine = new StandardJMeterEngine();
      final StandardJMeterEngine jmeter = _standardJMeterEngine;
      String _jmeterhome = this.getJmeterhome();
      String _plus = (_jmeterhome + "bin\\jmeter.properties");
      JMeterUtils.loadJMeterProperties(_plus);
      String _jmeterhome_1 = this.getJmeterhome();
      JMeterUtils.setJMeterHome(_jmeterhome_1);
      JMeterUtils.initLogging();
      JMeterUtils.initLocale();
      SaveService.loadProperties();
      String _jmxpath = this.getJmxpath();
      FileInputStream _fileInputStream = new FileInputStream(_jmxpath);
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
