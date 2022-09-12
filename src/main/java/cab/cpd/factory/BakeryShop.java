package cab.cpd.factory;

public class BakeryShop extends Shop{

  public BakeryShop() {
    super(ShopType.BAKERY);
  }

  @Override
  public void createShop() {
    items.add(new Bread());
    items.add(new Cake());
    items.add(new Muffin());
  }
}
