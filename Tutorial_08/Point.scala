package Tutorial_08

case class Point(xCord: Int, yCord: Int){
  // Adding two points
  def +(other: Point): Point = Point(this.xCord + other.xCord, this.yCord + other.yCord)

  // Move point by distance disX and disY
  def move(disX: Int, disY: Int): Point = Point(this.xCord + disX, this.yCord + disY)

  // Get the distance between two points
  def getDistance(other: Point): Int = {
    // Getting distance by pythagoras theorem
    val lengthSquared = scala.math.pow(this.xCord - other.xCord, 2) + scala.math.pow(this.yCord - other.yCord, 2)
    val length = scala.math.round(scala.math.sqrt(lengthSquared)).toInt
    length
  }

  def invert(): Point = Point(this.yCord, this.xCord)

  override def toString: String = "(" + this.xCord + ", " + this.yCord + ")";
}
