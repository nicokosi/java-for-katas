package fraction;

import static java.lang.Integer.max;

public record Fraction(int numerator, int denominator) {
  public Fraction add(Fraction fraction) {
    if (this.denominator == fraction.denominator) {
      return new Fraction(
        this.numerator + fraction.numerator,
        fraction.denominator);
    } else {
      if (this.denominator > fraction.denominator) {
        var numerator = this.numerator + fraction.numerator * this.denominator / fraction.denominator;
        return new Fraction(numerator, this.denominator);
      } else {
        var numerator = fraction.numerator + this.numerator * fraction.denominator / this.denominator;
        return new Fraction(numerator, fraction.denominator);
      }
    }
  }
}
