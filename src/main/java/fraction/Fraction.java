package fraction;

import static java.lang.Math.max;

public record Fraction(int numerator, int denominator) {
  public Fraction add(Fraction fraction) {
    if (this.denominator == fraction.denominator) {
      return new Fraction(
        this.numerator + fraction.numerator,
        fraction.denominator);
    } else {
      var numerator = this.denominator > fraction.denominator ?
        this.numerator + fraction.numerator * this.denominator / fraction.denominator :
        fraction.numerator + this.numerator * fraction.denominator / this.denominator;
      return new Fraction(numerator, max(this.denominator, fraction.denominator));
    }
  }
}
