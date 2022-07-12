package Tutorial_03

object Question_05 extends App {
  def checkNumbers(a: Int, b: Int): Unit = {
    if(a == 1) if(b == 1) println("***") else println("###") else println("===")
  }

  // Check for test data
  checkNumbers(1, 2)
  checkNumbers(1, 3)
  checkNumbers(2, 3)
  checkNumbers(2, 2)
}
