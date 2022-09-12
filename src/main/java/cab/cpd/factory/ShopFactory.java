package cab.cpd.factory;

public class ShopFactory {

  public static Shop getShop(final ShopType type) {
    switch (type) {
      case FRUIT:
        return new FruitShop();
      case BAKERY:
        return new BakeryShop();
      default:
        return null;
    }
  }
}
