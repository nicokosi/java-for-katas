import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("FizzBuzz")
class FizzBuzzTest {

  @ParameterizedTest
  @DisplayName("should return known values")
  @CsvSource(textBlock = """
      1,  1
      2,  2
      3,  Fizz
      4,  4
      5,  Buzz
      6,  Fizz
      7,  7
      8,  8
      9,  Fizz
      10, Buzz
      11, 11
      12, Fizz
      13, 13
      14, 14
      15, Fizz Buzz
    """)
  void fizzBuzz(final int input, final String output) {
    assertThat(FizzBuzz.value(input)).isEqualTo(output);
  }

}
