import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("A foo")
class FooTest {

  private Foo foo = new Foo();

  @Test
  @DisplayName("returns foo")
  void isNotEmpty() {
    assertThat(foo.foo())
      .isEqualTo("foo");
  }


}
