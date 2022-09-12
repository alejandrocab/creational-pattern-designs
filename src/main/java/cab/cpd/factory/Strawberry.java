package cab.cpd.factory;

public class Strawberry implements Item{

  @Override
  public boolean equals(Object obj) {
    return obj.toString().equals(this.toString());
  }

  @Override
  public String toString() {
    return "Starwberry";
  }
}
