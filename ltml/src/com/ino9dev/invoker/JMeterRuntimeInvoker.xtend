package com.ino9dev.invoker

import com.ino9dev.ltml.LoadTest
import java.io.FileInputStream
import org.apache.jmeter.engine.StandardJMeterEngine
import org.apache.jmeter.save.SaveService
import org.apache.jmeter.util.JMeterUtils
import com.ino9dev.ltml.Manifest

public class JMeterRuntimeInvoker implements RuntimeInvoker {

    @Property String jmeterhome = "C:\\apache-jmeter-2.13\\"
    @Property String jmxpath = jmeterhome+"bin\\test.jmx"
    @Property Manifest manifest
    @Property LoadTest loadtest

    override def invoke() {

        val StandardJMeterEngine jmeter = new StandardJMeterEngine()
        
        // JMeter Engine
        JMeterUtils.loadJMeterProperties(jmeterhome+"bin\\jmeter.properties")
        JMeterUtils::setJMeterHome(jmeterhome)
        JMeterUtils::initLogging()
        JMeterUtils::initLocale()
        SaveService::loadProperties()

        //todo load from .ltml file or memory
        
        //var in = new FileInputStream(JMETER_HOME+"testcase1_ver_1.0_lt002.jmx");
        
        var in = new FileInputStream(jmxpath)
        var testPlanTree = SaveService::loadTree(in)
        in.close();

        jmeter.configure(testPlanTree)
        jmeter.run
    }
}