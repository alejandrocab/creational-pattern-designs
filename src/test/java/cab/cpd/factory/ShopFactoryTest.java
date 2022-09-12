package cab.cpd.factory;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShopFactoryTest {

  @Test
  void when_getBackeryShopType_then_returnBreadCakeAndMuffinItems() {
    Shop shop = ShopFactory.getShop(ShopType.BAKERY);
    List<Item> items = shop.getItems();
    List<Item> itemsExpected = List.of(new Bread(), new Cake(), new Muffin());

    Assertions.assertTrue(items.containsAll(itemsExpected));
    Assertions.assertTrue(shop.getType().equals(ShopType.BAKERY));
  }

  @Test
  void when_getFruitShopType_then_returnAppleStrawberryAndWatermelonItems() {
    Shop shop = ShopFactory.getShop(ShopType.FRUIT);
    List<Item> items = shop.getItems();
    List<Item> itemsExpected = List.of(new Apple(), new Watermelon(), new Strawberry());

    Assertions.assertTrue(items.containsAll(itemsExpected));
    Assertions.assertTrue(shop.getType().equals(ShopType.FRUIT));
  }
}
