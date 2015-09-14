package ltml.tests;

import com.ino9dev.invoker.JMeterRuntimeInvoker;
import org.junit.Test;

@SuppressWarnings("all")
public class InovkerTest {
  @Test
  public void test() {
    JMeterRuntimeInvoker _jMeterRuntimeInvoker = new JMeterRuntimeInvoker();
    _jMeterRuntimeInvoker.invoke();
  }
}
