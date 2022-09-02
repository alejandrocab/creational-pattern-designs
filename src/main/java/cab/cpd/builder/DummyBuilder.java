package cab.cpd.builder;

public class DummyBuilder {

  private final String name;
  private final String description;
  private final String version;
  private final Double price;

  private DummyBuilder(Builder builder) {
    this.name = builder.name;
    this.description = builder.description;
    this.version = builder.version;
    this.price = builder.price;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public String getVersion() {
    return version;
  }

  public Double getPrice() {
    return price;
  }

  public static class Builder {
    private String name;
    private String description;
    private String version;
    private Double price;

    public Builder() {}

    public DummyBuilder build() {
      return new DummyBuilder(this);
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder description(String description) {
      this.description = description;
      return this;
    }

    public Builder version(String version) {
      this.version = version;
      return this;
    }

    public Builder price(Double price) {
      this.price = price;
      return this;
    }

  }
}
