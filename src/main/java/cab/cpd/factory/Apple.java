package cab.cpd.factory;

public class Apple implements Item{

  @Override
  public boolean equals(Object obj) {
    return obj.toString().equals(this.toString());
  }

  @Override
  public String toString() {
    return "Apple";
  }
}
