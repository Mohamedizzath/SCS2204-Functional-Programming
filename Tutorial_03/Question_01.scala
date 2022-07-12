package Tutorial_03

import scala.io.StdIn.readInt

object Question_01 extends App {
  // Function for getting absolute value of a number
  def getAbsolute(number: Int): Int = number match{
    case x if (x >= 0) => x
    case x if (x < 0) => -x
  }

  // Getting a number as an input and displaying to the user
  print("Please enter the number: ")
  val number = readInt()

  println(s"Absolute value of $number is ${getAbsolute(number)}")
}
