package ltml.tests

import org.junit.Test
import com.ino9dev.invoker.JMeterRuntimeInvoker

class InovkerTest {
    
    @Test
    def void test(){
        (new JMeterRuntimeInvoker).invoke
    }
}