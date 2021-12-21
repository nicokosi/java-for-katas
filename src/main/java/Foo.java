record Foo (Bar bar) {
  String foo(String dummyInput) {
    return bar.bar();
  }
}
class Bar {
  public String bar() {
    return "bar";
  }
}
