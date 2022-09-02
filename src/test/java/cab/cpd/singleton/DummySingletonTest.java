package cab.cpd.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DummySingletonTest {

  @Test
  void when_getInstance_then_returnSameObject() {
    DummySingleton instance = DummySingleton.getInstance();
    DummySingleton anotherInstance = DummySingleton.getInstance();
    Assertions.assertEquals(instance, anotherInstance);
  }

  @Test
  void when_getInstanceSecondTime_then_expectLessTimeThanOnceTime() {
    long timeInstance = 0;
    long timeAnotherInstance = 0;
    //calculate time getInstance first time
    long startTime = System.currentTimeMillis();
    DummySingleton instance = DummySingleton.getInstance();
    long finishTime = System.currentTimeMillis();
    timeInstance = finishTime - startTime;
    //reset times
    startTime = 0;
    finishTime = 0;
    //calculate time getInstance second time
    startTime = System.currentTimeMillis();
    DummySingleton anotherInstance = DummySingleton.getInstance();
    finishTime = System.currentTimeMillis();
    timeAnotherInstance = finishTime - startTime;
    //asserts
    Assertions.assertTrue(timeInstance > timeAnotherInstance);
    Assertions.assertEquals(instance, anotherInstance);
  }
}
