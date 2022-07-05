package Tutorial_01

object Question_04_Second_Part extends App {
  def getProfit(ticketPrice: Int): Int = {
    val attendess = getAttendees(ticketPrice)
    val profit = (attendess * ticketPrice) - 500 - (attendess * 3)

    profit
  }

  def getAttendees(ticketPrice: Int): Int = 120 - (((ticketPrice - 15) / 5) * 20)

  val ticketpriceList: List[Int] = List(20, 25, 30, 35, 40, 45, 50)
  val profitList: List[Int] = List(getProfit(ticketpriceList(0)), getProfit(ticketpriceList(1)), getProfit(ticketpriceList(2)), getProfit(ticketpriceList(3)), getProfit(ticketpriceList(4)), getProfit(ticketpriceList(5)));
  println(profitList);
}
