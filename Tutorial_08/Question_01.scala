package Tutorial_08

object Question_01 extends App {
    // Driver program
    val firstPoint = Point(4, 3)
    val secondPoint = Point(0, 3)

    println(s"${firstPoint} + ${secondPoint} = ${firstPoint + secondPoint}")
    println(s"Moving the point ${firstPoint} by x = 2 and y = 3 will results ${firstPoint.move(2, 3)}")
    println(s"Distance between ${firstPoint} and ${secondPoint} is ${firstPoint.getDistance(secondPoint)}")
    println(s"Invert of ${secondPoint} is ${secondPoint.invert()}")
}
