package Tutorial_02

object Question_01_First_Part extends App {
  // Step 1. Declaring all the variables ( Answer for the question 1 and question 2)
  val i = 2
  val j, k = 2
  val m, n = 5
  val f: Float = 12.0f
  val g: Float = 4.0f
  val c: Char = 'X'

  // Step evaluating expressions ( Answer for the question3 )
  val firstExp = k + 12 * m // 62
  val secondExp = m / j // 2
  val thirdExp = n % j // 1
  val fourthExp = m / j * j // 4
  val fifthExp = f + 10 * 5 + g // 66.0
   // val sixthExp = ++i * n -> Since Scala doesn't have a function for pre increment
  // and post increment operators(i++, ++i) this is not a valid expression in Scala

}
