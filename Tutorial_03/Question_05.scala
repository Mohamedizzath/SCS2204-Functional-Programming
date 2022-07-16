package Tutorial_03

object Question_05 extends App {
  // Function for getting running time at easy paces
  def getTimeEasy(distance: Double): Double = 8 * distance

  // Function for getting running time at tempo
  def getTimeTempo(distance: Double): Double = 7 * distance

  println(s"Total running time is ${getTimeEasy(2) + getTimeTempo(3) + getTimeEasy(2)}")
}
