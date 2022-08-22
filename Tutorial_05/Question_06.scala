package Tutorial_05

object Question_06 extends App {
  // Recurive function for getting nth fibb numbers
  def getFibb(position: Int): Int =
    if(position == 0) return 0
    else if(position == 1) return 1
    else return getFibb(position - 1) + getFibb(position - 2)

  // Function for getting a series of fibbonacci numbers
  def generateFibSeq(number: Int): Unit = {
    if(number > 1) generateFibSeq(number - 1)

    // Print the nth fibbonacci number
    println(s"${number} nth fibbonacci number is ${getFibb(number)}")
  }

  // Driver part of the program
  generateFibSeq(20)
}
