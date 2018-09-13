import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Foo")
class FooTest {

  private Bar bar = mock(Bar.class);

  private Foo foo = new Foo(bar);

  @Test
  @DisplayName("returns mocked bar")
  void returns_mocked_bar() {
    when(bar.bar()).thenReturn("foo");
    assertThat(foo.foo("plop")).isEqualTo("foo");
  }

}
