import net.jqwik.api.*;

class FooPropertyBasedTests {

  @Property
  @Label("always returns bar")
  boolean always_return_bar(@ForAll("anyString") String anyString) {
    return new Foo(new Bar()).foo(anyString).equals("bar");
  }

  @Provide
  private Arbitrary<String> anyString() {
    return Arbitraries.strings().all();
  }

}
