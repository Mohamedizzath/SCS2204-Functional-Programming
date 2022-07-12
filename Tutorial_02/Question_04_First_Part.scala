package Tutorial_02

import scala.io.StdIn.readInt

object Question_04_First_Part extends App {
  // Function which need to calculate take home salary
  def getInitialSalary(workingHours: Int, otHours: Int): Double = 250.0d * workingHours + 85.0d * otHours
  def getTaxAmount(workingHours: Int, otHours: Int): Double =
    if(workingHours >= 40 && otHours >= 12) getInitialSalary(workingHours, otHours) * 0.12
    else 0

  def getTakeHomeSalary(workingHours: Int, otHours: Int): Double = getInitialSalary(workingHours, otHours) - getTaxAmount(workingHours, otHours)

  // Get the working hours and ot hours as inputs
  print("Please enter working hours of you're employee: Rs.")
  val workingHours = readInt()

  print("Please enter working hours of you're employee: Rs.")
  val otHours = readInt()

  val totalTakeHomeSalary = getTakeHomeSalary(workingHours, otHours);
  println(s"Total take home salary is Rs.$totalTakeHomeSalary")
}
