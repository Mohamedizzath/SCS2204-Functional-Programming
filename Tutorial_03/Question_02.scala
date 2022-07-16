package Tutorial_03

object Question_02 extends App {
  // Function for converting temperature from celsius to fahrenheit
  def convertCelToFah(temperature: Double): Double = temperature * 1.8 + 32

  val temperature = 35.0d
  println(s"The temperature $temperature in celsius is equals to ${convertCelToFah(temperature)} in Fahrenheit")
}
