import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ProductStoreTest {

  private final ProductStore productStore = new ProductStore();

  @Test
  void productsWithMinimumPrice() {
    assertThat(
      productStore.productsWithMinimumPrice(2_000)
    ).containsOnly(
      new Product("car", 10_000)
    );
  }

  @Test
  void manyProductsWithMinimumPrice() {
    assertThat(
      productStore.manyProductsWithMinimumPrice(1)
    ).isNotEmpty();
  }

  @Test
  void averagePrice() {
    assertThat(
      productStore.averagePrice()
    ).isEqualTo(3667);
  }

}
