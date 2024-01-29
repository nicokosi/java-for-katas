import java.util.stream.Stream;

public class SteamOfStrings {

  public static void main(String[] args) {
    Stream.Builder<String> streamOfStrings = Stream.builder();
    streamOfStrings.add("hello");
    streamOfStrings.add("world");
    streamOfStrings.add("👋");
    streamOfStrings.build().forEach(System.out::println);
  }

}
