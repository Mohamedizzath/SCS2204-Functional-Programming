package Tutorial_05

object Question_01 extends App{
  // Function for checking whether given number is prime or not
  def checkPrimes(number: Int): Boolean =
    // Loop through the number check for the divisibility
    if(loopPrime(number, Math.sqrt(number).toInt )) return true
    else return false


  // Get the given number is divisible by given divider
  def loopPrime(number: Int, divider: Int): Boolean =
    if(number % divider == 0) return false
    else if(divider > 2) return loopPrime(number, divider - 1)
    else return true

  // Driver part of the program check for prime of given set of number
  println(s"Is 5 prime number?")
  if(checkPrimes(5)) println("Number 5 is prime")
  else println("Number 5 is not prime")
  println()

  println(s"Is 12 prime number?")
  if(checkPrimes(12)) println("Number 12 is prime")
  else println("Number 12 is not prime")
  println()

  println(s"Is 7 prime number?")
  if(checkPrimes(7)) println("Number 7 is prime")
  else println("Number 7 is not prime")
  println()

  println(s"Is 10 prime number?")
  if(checkPrimes(10)) println("Number 10 is prime")
  else println("Number 10 is not prime")
}
