package Tutorial_05

object Question_04 extends App {
  // Recursive function for checking whether given number is odd or even
  def isEven(number: Int): Boolean =
    if(number == 1) return false
    else if(!isEven(number - 1)) return true
    else return false

  // Driver part of the program to check the validity
  val firstNumber = 11
  println(s"The number ${firstNumber} is ${if(isEven(firstNumber)) "Even" else "Odd"}")

  val secondNumber = 20
  println(s"The number ${secondNumber} is ${if(isEven(secondNumber)) "Even" else "Odd"}")
}
