package Tutorial_03

object Question_07 extends App {
  // Check for the month
  def checkMonth(monthNumber: Int): String = {
    if(monthNumber == 12 || monthNumber == 1 || monthNumber == 2) "Winter"
    else if(monthNumber == 3 || monthNumber == 4 || monthNumber == 5) "Spring"
    else if(monthNumber == 6 || monthNumber == 7 || monthNumber == 8) "Summer"
    else if(monthNumber == 9 || monthNumber == 10 || monthNumber == 11) "Autumn"
    else "Bogus Month"
  }

  // Get month number from the user and display the season which it belongs
  print("Please enter your chosen month as month number (1. January, 2. February, etc.): ")
  val monthNumber = scala.io.StdIn.readInt()

  println(checkMonth(monthNumber))
}
