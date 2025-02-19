import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductStoreTest {
  @Test
  void productsWithMinimumPrice() {
    Assertions.assertThat(
      new ProductStore().productsWithMinimumPrice(2_000)
    ).containsOnly(
      new Product("car", 10_000)
    );
  }
}
