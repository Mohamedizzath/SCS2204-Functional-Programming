package Tutorial_04

object Question_04{
  // Check whether it is even or odd
  def isEven(number: Int): Boolean = if(number == 0) true else if(!isEven(number - 1)) true else false

  def main(args: Array[String]): Unit = {
    // Getting number as the input from the command line
    val input = if(args.length > 0) args(0).toInt else 0

    if(isEven(input)) println("Even number") else println("Odd number")
  }
}
