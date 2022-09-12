package cab.cpd.factory;

public class FruitShop extends Shop{

  public FruitShop() {
    super(ShopType.FRUIT);
  }

  @Override
  public void createShop() {
    items.add(new Apple());
    items.add(new Strawberry());
    items.add(new Watermelon());
  }
}
