package Tutorial_03

object Question_03 extends App {
  // Finding largest number between three number
  def findMaxUsingIf(first: Int, second: Int, third: Int): Int = {
    var currentMax = first
    if(first < second){
      currentMax = second
    }
    if(currentMax >= third){
      return currentMax
    }else{
      return third
    }
  }

  // Finding largest number using ternary operator
  def findMaxUsingTernary(first: Int, second: Int, third: Int): Int = if(first >= second) if(first >= third) first else third else if(second >= third) second else third

  print("Please enter first number: ")
  val first = scala.io.StdIn.readInt()

  print("Please enter second number: ")
  val second = scala.io.StdIn.readInt()

  print("Please enter third number: ")
  val third = scala.io.StdIn.readInt()

  println(s"Maximum using if statements = ${findMaxUsingIf(first, second, third)}")
  println(s"Maximum using ternary operator = ${findMaxUsingTernary(first, second, third)}")
}
