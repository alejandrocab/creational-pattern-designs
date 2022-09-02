package cab.cpd.prototype;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrototypeShallowTest {

  private static final String NAME_ITEM = "NAME";
  private static final String DECRIPTION_ITEM = "DESCRIPTION";
  private static final SubItem SUBITEM = new SubItem();
  private static final List<String> LIST_ITEM = new ArrayList<>();

  Registry registry = new Registry(initItem());

  @Test
  void when_createItem_then_Copy() {
    Item item = registry.createItem();
    item.setName("ITEM");

    Assertions.assertNotEquals(item.getName(), NAME_ITEM);
    Assertions.assertEquals(item.getDescription(), DECRIPTION_ITEM);
    Assertions.assertEquals(item.getSubItem(), SUBITEM);
    Assertions.assertEquals(item.getList(), LIST_ITEM);
  }

  @Test
  void when_createMultiplesItem_then_Uniques() {
    Item item = registry.createItem();
    Item anotherItem = registry.createItem();

    Assertions.assertNotEquals(item, anotherItem);
  }

  @Test
  void shallowCopyTest() throws CloneNotSupportedException {
    //create item
    Item item = initItem();
    //clone item
    Item anotherItem = (Item) item.clone();
    //modify a property with reference
    item.getList().add("One");

    Assertions.assertNotEquals(item, anotherItem);
    Assertions.assertEquals(item.getList(), anotherItem.getList());

  }

  private Item initItem() {
    Item item = new Item();
    item.setName(NAME_ITEM);
    item.setDescription(DECRIPTION_ITEM);
    item.setSubItem(SUBITEM);
    item.setList(LIST_ITEM);
    return item;
  }
}
