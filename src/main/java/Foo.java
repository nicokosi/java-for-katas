final class Bar extends Barable {
  @Override
  String bar() {
    return "bar";
  }
}

sealed abstract class Barable permits Bar {
  String bar() { return ""; }
}
