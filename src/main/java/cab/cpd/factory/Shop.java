package cab.cpd.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Shop {

  protected List<Item> items = new ArrayList<>();

  protected ShopType type;

  public Shop(ShopType type) {
    this.type = type;
    this.createShop();
  }

  public List<Item> getItems() {
    return items;
  }

  public ShopType getType() {
    return type;
  }


  public abstract void createShop();
}
