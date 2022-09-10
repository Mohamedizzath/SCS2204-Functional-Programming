package Tutorial_07

object Question_02 extends App {
  // Setting numbers and perform subtraction
  val x = new Rational(3, 4)
  val y = new Rational(5, 8)
  val z = new Rational(2, 7)

  val result = x - y - z
  println(s"Result of the calculation is ${result}")
}
