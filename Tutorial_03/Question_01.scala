package Tutorial_03

object Question_01 extends App {
  // Function for calculating radius
  def getAreaOfCircle(radius: Double): Double = scala.math.Pi * radius * radius

  val radius = 5.0d
  println(s"Area of the circle with radius of $radius is ${getAreaOfCircle(radius)}")
}
