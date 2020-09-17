final class Bar extends Barable {
  @Override
  String bar() {
    return """
      bar
      """.stripTrailing();
  }
}

sealed abstract class Barable permits Bar {
  String bar() { return ""; }
}
