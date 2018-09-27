class Foo {

  private Bar bar;

  Foo(Bar bar) {
    var unused = "helloworld";
    this.bar = bar;
  }

  String foo(String dummyInput) {
    return bar.bar();
  }

}

class Bar {

  String bar() {
    return "bar";
  }

  String hello(String input) {
    input = "none";
    return "dummy";
  }

}
