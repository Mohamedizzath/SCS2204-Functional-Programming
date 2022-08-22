package Tutorial_05

object Question_03 extends App {
  // Function for getting the addition numbers from 1 upto n
  def gettingSum(number: Int): Int =
    if(number == 1) return 1
    else return number + gettingSum(number - 1)

  // Driver program to getting the summation
  val number = 5
  println(s"The sum for numbers starting from 1 to ${number} is ${gettingSum(number)}")
}
