import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ProductStore {
  private final static List<Product> products = Arrays.asList(
    new Product("bread", 1),
    new Product("computer", 1_000),
    new Product("car", 10_000)
  );

  private static final List<Product> manyProducts =
    IntStream.iterate(123, i -> i + 1)
      .limit(1_000_000)
      .mapToObj(i -> new Product("label " + i, i))
      .toList();

  public List<Product> productsWithMinimumPrice(double minimumPrice) {
    return products.stream()
      .filter(product -> product.price() > minimumPrice)
      .toList();
  }

  public List<Product> manyProductsWithMinimumPrice(double minimumPrice) {
    return manyProducts.stream()
      .filter(product -> product.price() > minimumPrice)
      .toList();
  }

  public double averagePrice() {
    return products.stream()
      .mapToDouble(Product::price)
      .average()
      .orElse(0);
  }
}
