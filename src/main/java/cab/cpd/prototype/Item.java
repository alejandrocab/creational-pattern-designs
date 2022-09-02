package cab.cpd.prototype;

import java.util.List;

public class Item implements Cloneable{

  private String name;
  private String description;
  private List<String> list;
  private SubItem subItem;

  /**This will create a shallow copy*/
  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public List<String> getList() {
    return list;
  }

  public void setList(List<String> list) {
    this.list = list;
  }

  public SubItem getSubItem() {
    return subItem;
  }

  public void setSubItem(SubItem subItem) {
    this.subItem = subItem;
  }
}
