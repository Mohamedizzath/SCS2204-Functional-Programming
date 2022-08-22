package Tutorial_05

object Question_02 extends App {
  // Functions used for checking the prime which used in Question-01
  def checkPrimes(number: Int): Boolean =
  // Loop through the number check for the divisibility
    if(loopPrime(number, Math.round(Math.sqrt(number)).toInt)) return true
    else return false


  // Get the given number is divisible by given divider
  def loopPrime(number: Int, divider: Int): Boolean = {
    if(number == 2) return true
    else if(number % divider == 0) return false
    else if(divider > 2) return loopPrime(number, divider - 1)
    else return true
  }

  // Function for getting the list of prime numbers
  def printSequence(number: Int): Unit = {
    if(number > 1) {
      printSequence(number - 1)
    }

    if(checkPrimes(number)) println(number)
  }

  // Driver program to getting to sequence
  printSequence(10)
}
