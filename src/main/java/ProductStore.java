import java.util.Arrays;
import java.util.List;

public class ProductStore {
  private final static List<Product> products = Arrays.asList(
    new Product("bread", 1),
    new Product("computer", 1_000),
    new Product("car", 10_000)
  );

  public List<Product> productsWithMinimumPrice(double minimumPrice) {
    return products.stream()
      .filter(product -> product.price() > minimumPrice)
      .toList();
  }
}
