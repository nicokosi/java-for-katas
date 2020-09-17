import net.jqwik.api.Arbitraries;
import net.jqwik.api.Arbitrary;
import net.jqwik.api.ForAll;
import net.jqwik.api.Label;
import net.jqwik.api.Property;
import net.jqwik.api.Provide;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class BarTest {

  @Test
  @DisplayName("returns bar")
  void bar() {
    assertThat(new Bar().bar()).isEqualTo("bar");
  }

  @ParameterizedTest
  @ValueSource(strings = {"foo", "bar", "baz"})
  @DisplayName("returns bar even with dummy parameter")
  void parameterized_bar(String input) {
    System.out.println("Unused " + input + " \uD83D\uDE07");
    assertThat(new Bar().bar()).isEqualTo("bar");
  }

  @Property
  @Label("always returns bar")
  boolean bar_rule(@ForAll("anyString") String anyString) {
    System.out.println("Unused " + anyString + " \uD83D\uDE07");
    return new Bar().bar().equals("bar");
  }

  @Provide
  Arbitrary<String> anyString() {
    return Arbitraries.strings().all();
  }

}
