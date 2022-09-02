package cab.cpd.singleton;

public class DummySingleton {

  private static volatile  DummySingleton instance = null;


  private DummySingleton() {
    //to avoid creation througth reflection
    if (instance != null) {
      throw new RuntimeException("Use getInstance() method to create!");
    }
  }

  public static DummySingleton getInstance() {
    //check if null to create a new instance, only the first time when getInstance method is called. Lazy load.
    if (instance == null) {
      //thread safe
      synchronized (DummySingleton.class) {
        if (instance == null) {
          instance = new DummySingleton();
        }
      }
    }
    return instance;
  }
}
