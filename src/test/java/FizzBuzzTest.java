import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {

  @ParameterizedTest
  @CsvSource(value = {
    "1,1",
    "2,2",
    "3,Fizz",
    "4,4",
    "5,Buzz",
    "6,Fizz",
    "7,7",
    "8,8",
    "9,Fizz",
    "10,Buzz",
    "11,11",
    "12,Fizz",
    "13,13",
    "14,14",
    "15,FizzBuzz",
    "16,16",
    "17,17",
    "18,Fizz",
    "19,19",
    "20,Buzz",
  })
  void fizzbuzz(String input, String expectedOutput) {
    assertThat(
      FizzBuzz.evaluate(Integer.parseInt(input)))
      .isEqualTo(expectedOutput);
  }

}
