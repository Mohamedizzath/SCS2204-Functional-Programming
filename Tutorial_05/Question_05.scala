package Tutorial_05

object Question_05 extends App {
  // Using the check even function in the Question-04
  def isEven(number: Int): Boolean =
    if(number == 1) return false
    else if(!isEven(number - 1)) return true
    else return false

  // Printing out the list of even numbers
  def printSequence(number: Int): Unit = {
    if(number > 2) printSequence(number - 1)

    // Check is even and print number
    if(isEven(number)) println(number)
  }

  // Getting the addition
  def getAdditionSum(number: Int): Int =
  if(number > 1 && isEven(number)) getAdditionSum(number - 1) + number
  else if(number > 1 && !isEven(number)) getAdditionSum(number - 1)
  else return 0

  // Driver part of the program
  printSequence(31)
  println(getAdditionSum(15))
}
