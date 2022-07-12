package Tutorial_02

object Question_03_Second_Part extends App {
  // Initialize variables
  var a = 2
  var b = 3
  var c = 4
  var d = 5
  var k: Float = 4.3f
  var g: Float = 6.8f

  // 1. --b*a+c*d--
  b -= 1
  println(b*a+c*d) // 24
  d -= 1

  // 2. a++
  println(a) // 2
  a += 1

  // 3. -2 * (g - k) + c
  println(-2 * (g - k) + c) // -1.0

  // 4. c = c++
  var assignmentResult: Unit = c = 8
  println(assignmentResult) // () Unit
  c += 1

  // 5. c = ++c*a++
  c += 1
  println(c * a) // 18
  a += 1
}
