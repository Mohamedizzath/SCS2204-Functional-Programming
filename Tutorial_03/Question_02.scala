package Tutorial_03

object Question_02 extends App {
  // Maximum function using if else
  def maxUsingIf(first: Int, second: Int): Int =
    if(first >= second) {
      return first
    }else {
      return second
    }

  // Maximum function using ternary operator
  // Scala doesn't supports ternary operator
  def maxUsingTernary(first: Int, second: Int): Int = if (first >= second) first else second

  print("Please enter first number: ")
  val first = scala.io.StdIn.readInt()

  print("Please enter second number: ")
  val second = scala.io.StdIn.readInt()

  println(s"Maximum using if statements = ${maxUsingIf(first, second)}")
  println(s"Maximum using ternary operator = ${maxUsingTernary(first, second)}")
}
