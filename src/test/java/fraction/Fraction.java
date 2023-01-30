package fraction;

import static java.lang.Integer.max;

public record Fraction(int numerator, int denominator) {
  public Fraction add(Fraction fraction) {
    if (this.denominator == fraction.denominator) {
      return new Fraction(this.numerator + fraction.numerator, fraction.denominator);
    } else {
      return new Fraction(
        this.numerator * this.denominator / fraction.denominator
          + fraction.numerator * fraction.denominator / this.denominator,
        max(this.denominator, fraction.denominator));
    }
  }
}
