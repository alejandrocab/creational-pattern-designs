package cab.cpd.prototype;

public class Registry {

  private Item item;

  public Registry(Item item) {
    this.item = item;
  }

  public Item createItem() {
    Item response = null;
    try {
      response = (Item) item.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return response;
  }
}
