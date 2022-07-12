package Tutorial_03

object Question_04 extends App {
  // Finding a given number is odd or even
  def isEven(number: Int): Boolean = if (number % 2 == 0) true else false

  print("Please enter the number which you need to test odd or even: ")
  val number = scala.io.StdIn.readInt()

  if(isEven(number)) println(s"The given number $number is Even")
  else println(s"The given number $number is Odd")
}
