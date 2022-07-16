package Tutorial_03

object Question_03 extends App {
  // Function for calculating the volume of a sphere
  def calculateVolume(radius: Double): Double = (4.0d / 3.0d) * scala.math.Pi * radius * radius * radius

  val radius = 5.0d
  println(s"The volume of the sphere with radius $radius is ${calculateVolume(radius)}")
}
