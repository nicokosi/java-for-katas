import net.jqwik.api.Label;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@DisplayName("Foo")
@Label("Foo")
class FooTest {

  private final Bar bar = mock(Bar.class);
  private final Foo foo = new Foo(bar);

  @Test
  @DisplayName("returns mocked bar")
  void returns_mocked_bar() {
    when(bar.bar()).thenReturn("foo");
    assertThat(foo.foo("plop")).isEqualTo("foo");
  }

  @ParameterizedTest
  @ValueSource(strings = {"foo", "bar", "baz"})
  @DisplayName("returns mocked bar for")
  void foo_bar_baz_return_mocked_bar(String input) {
    when(bar.bar()).thenReturn("foo");
    assertThat(foo.foo(input)).isEqualTo("foo");
  }

}
