package Tutorial_03

object Question_04 extends App {
  // Function for calculating the total cost for the books
  def costForBooks(numberOfBooks: Int): Double = {
    val cost = numberOfBooks * 24.95
    return cost - (cost * 0.4)
  }

  // Function for calculating shipping cost
  def getShippingCost(numberOfBooks: Int): Double =
    if(numberOfBooks >= 50)
      50 * 3 + (numberOfBooks - 50) * 0.75
    else
      numberOfBooks * 3

  // Function for getting total amount
  def calculateTotal(numberOfBooks: Int): Double = costForBooks(numberOfBooks) + getShippingCost(numberOfBooks)

  val numberOfBooks = 60
  println(s"Total cost for $numberOfBooks books is ${calculateTotal(numberOfBooks)}")

}
