package com.ino9dev.invoker

import org.apache.jorphan.collections.HashTree
import com.google.inject.Inject
import java.io.FileInputStream
import org.apache.jmeter.engine.StandardJMeterEngine
import org.apache.jmeter.util.JMeterUtils
import org.apache.jmeter.save.SaveService

public class JMeterRuntimeInvoker implements RuntimeInvoker {

    override def invoke() {

        val StandardJMeterEngine jmeter = new StandardJMeterEngine()
        
        // JMeter Engine
        val JMETER_HOME = "C:\\apache-jmeter-2.13\\"
        JMeterUtils.loadJMeterProperties(JMETER_HOME+"bin\\jmeter.properties")
        JMeterUtils::setJMeterHome(JMETER_HOME)
        JMeterUtils::initLogging()
        JMeterUtils::initLocale()
        SaveService::loadProperties()

        //var in = new FileInputStream(JMETER_HOME+"testcase1_ver_1.0_lt002.jmx");
        var in = new FileInputStream(JMETER_HOME+"bin\\test.jmx");
        var testPlanTree = SaveService::loadTree(in)
        in.close();
        
        jmeter.configure(testPlanTree)
        jmeter.run
    }
}