package cab.cpd.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DummyBuilderTest {

  @Test
  void when_callBuilderWithoutAnyAttribute_thenReturnObjectWithNullAttributes() {
    DummyBuilder builder = new DummyBuilder.Builder().build();

    Assertions.assertNull(builder.getName());
    Assertions.assertNull(builder.getDescription());
    Assertions.assertNull(builder.getVersion());
    Assertions.assertNull(builder.getPrice());
  }

  @Test
  void when_callBuilderWithAnyAttribute_thenReturnObjectWithGivenAttributesInBuilder() {
    DummyBuilder builder = new DummyBuilder.Builder().name("test").version("1.0.0").build();

    Assertions.assertNotNull(builder.getName());
    Assertions.assertNull(builder.getDescription());
    Assertions.assertNotNull(builder.getVersion());
    Assertions.assertNull(builder.getPrice());
  }


  @Test
  void when_callBuilderWithAllAttribute_thenReturnObjectWithGivenAttributesInBuilder() {
    DummyBuilder builder = new DummyBuilder.Builder().name("test").version("1.0.0").description("test").price(10.0).build();

    Assertions.assertNotNull(builder.getName());
    Assertions.assertNotNull(builder.getDescription());
    Assertions.assertNotNull(builder.getVersion());
    Assertions.assertNotNull(builder.getPrice());
  }
}
