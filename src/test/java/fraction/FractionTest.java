package fraction;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FractionTest {

  @Test
  void same_denominator() {
    assertThat(
      new Fraction(1, 1).add(new Fraction(2, 1)))
      .isEqualTo(
        new Fraction(3, 1)
      );
  }

  @Test
  void different_denominator() {
    assertThat(
      new Fraction(1, 1)
        .add(
          new Fraction(2, 3)))
      .isEqualTo(
        new Fraction(5, 3));
  }

}
