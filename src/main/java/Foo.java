class Foo {

  private Bar bar;

  Foo(Bar bar) {
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

}
