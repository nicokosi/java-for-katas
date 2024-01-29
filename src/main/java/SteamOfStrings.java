import java.util.stream.Stream;

public class SteamOfStrings {

  public static void main(String[] args) {
    var streamOfStrings = Stream.builder();
    streamOfStrings.add("hello");
    streamOfStrings.add("world");
    streamOfStrings.add("👋");
    streamOfStrings.build()
      .forEach(System.out::println);
  }

}
