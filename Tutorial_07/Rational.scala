package Tutorial_07

// Rational class
class Rational(numerator: Int, denominator: Int){
  def num: Int = numerator
  def deno: Int = denominator

  // Question 01: Getting the negative rational number
  def neg() = new Rational(-this.num, this.deno)

  // Subtract method
  def -(other: Rational) = new Rational(this.numerator * other.deno - this.denominator * other.num, this.denominator * other.deno)

  override def toString: String = num + "/" + deno
}
