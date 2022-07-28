package Tutorial_04

object Question_01 extends App {
  // Calculate the interest
  def getInterest(deposit: Double): Double = deposit match{
    case x if(x > 2000000) => x * 0.065
    case x if(x > 200000) => x * 0.035
    case x if(x > 20000) => x * 0.04
    case x => x * 0.002
  }

  print("Please enter the deposit amount: ")
  val deposit = scala.io.StdIn.readInt()
  println(s"Interest amount for ${deposit} is ${getInterest(deposit)}")
}
