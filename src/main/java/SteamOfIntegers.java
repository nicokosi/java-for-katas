import java.util.ArrayList;
import java.util.stream.IntStream;

public class SteamOfIntegers {

  public static void main(String[] args) {
    var retained = new ArrayList<>();
    var numbers = IntStream.range(1, 1_000_000_000);
    numbers
      .forEach(n -> {
        retained.add(n); // Uncommenting the line can trigger a OutOfMemoryError "Java heap space" exception
        if (n % 100_000 == 0) System.out.println(n);
      });
    System.out.println("Retained: " + retained.size());
  }

}
