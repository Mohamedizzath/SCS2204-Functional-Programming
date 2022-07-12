package Tutorial_03

object Question_06 extends App {
  // Check for students average marks using 5 if-else statements
  def checkAverageIf(average: Double): Unit = {
    if(average < 0) println("Invalid Marks")
    else if(average > 69.0d) println("Very Good")
    else if(average > 54.0d && average <= 69.0d) println("Good")
    else if(average > 39.0d && average <=  54.0d) println("Pass")
    else println("Fail")
  }

  // Check for the students average marks using nested if statements
  def checkAverageNestedIf(average: Double): Unit = {
    if(average < 0){
      println("Invalid Marks")
    }else{
      if(average > 69.0d) {
        println("Very Good")
      }else{
        if(average > 54.0d && average <= 69.0d) {
          println("Good")
        }else{
          if(average > 39.0d && average <=  54.0d) {
            println("Pass")
          }else{
            println("Fail")
          }
        }
      }
    }
  }

  // Check students average marks using ternary operator
  def checkAverageTernary(average: Double): Unit = if(average < 0) println("Invalid Marks") else if(average > 69.0d) println("Very Good") else if(average > 54.0d && average <= 69.0d) println("Good") else if(average > 39.0d && average <=  54.0d) println("Pass") else println("Fail")

  // Test run
  print("Please enter student average mark: ")
  val average = scala.io.StdIn.readInt()

  checkAverageIf(average)
  checkAverageNestedIf(average)
  checkAverageTernary(average)
}
