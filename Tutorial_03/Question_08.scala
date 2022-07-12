package Tutorial_03

object Question_08 extends App {
  // Functions to convert temperature from celsius to fahrenheit and vice-versa
  def convertCelToFah(temperature: Double): Double = (9.0d / 5) * temperature + 32
  def convertFahToCel(temperature: Double): Double = (5.0d / 9) * (temperature - 32)

  println("Choose an action which you need to perform:")
  println("1. Convert temperature from celsius to fahrenheit")
  println("2. Convert temperature from fahrenheit to celsius")

  val userChoice = scala.io.StdIn.readInt()

  if(userChoice == 1){
    print("Please enter temperature in celsius: ")
    val temperature = scala.io.StdIn.readDouble()
    println(s"Temperature in fahrenheit is ${convertCelToFah(temperature)}")
  }else if(userChoice == 2){
    print("Please enter temperature in fahrenheit: ")
    val temperature = scala.io.StdIn.readDouble()
    println(s"Temperature in celsius is ${convertFahToCel(temperature)}")
  }else{
    println("Invalid choice!")
  }
}
