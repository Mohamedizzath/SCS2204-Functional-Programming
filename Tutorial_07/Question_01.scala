package Tutorial_07

object Question_01 extends App {
  // Driver program for getting negative value
  val firstNum = new Rational(12, 24)
  println(s"Negative value of ${firstNum} is ${firstNum.neg()}")

  val secondNum = new Rational(-11, 32)
  println(s"Negative value of ${secondNum} is ${secondNum.neg()}")
}
