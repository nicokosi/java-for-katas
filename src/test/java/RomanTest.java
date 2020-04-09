import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RomanTest {
  private final Roman roman = new Roman();

  @Test
  void one() {
    assertThat(roman.roman(1)).isEqualTo("I");
  }

  @Test
  void two() {
    assertThat(roman.roman(2)).isEqualTo("II");
  }

  @Test
  void four() {
    assertThat(roman.roman(4)).isEqualTo("IV");
  }

  @Test
  void five() {
    assertThat(roman.roman(5)).isEqualTo("V");
  }

  @Test
  void six() {
    assertThat(roman.roman(6)).isEqualTo("VI");
  }

  @Test
  void ten() {
    assertThat(roman.roman(10)).isEqualTo("X");
  }

  @Test
  void twenty() {
    assertThat(roman.roman(20)).isEqualTo("XX");
  }

}
