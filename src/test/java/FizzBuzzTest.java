import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("FizzBuzz")
class FizzBuzzTest {

  @ParameterizedTest
  @DisplayName("should return correct value")
  @CsvSource(textBlock = """
      1,         1
    """)
  void fizzBuzz(final int input, final int output) {
    assertThat(FizzBuzz.fizzBuzz(input)).isEqualTo(output);
  }

}
