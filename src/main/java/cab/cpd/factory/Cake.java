package cab.cpd.factory;

public class Cake implements Item{

  @Override
  public boolean equals(Object obj) {
    return obj.toString().equals(this.toString());
  }

  @Override
  public String toString() {
    return "Cake";
  }
}
