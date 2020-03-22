record Foo (Bar bar) {
  String foo(String dummyInput) {
    return bar.bar();
  }
}
class Bar {
  String bar() {
    return "bar";
  }
}
