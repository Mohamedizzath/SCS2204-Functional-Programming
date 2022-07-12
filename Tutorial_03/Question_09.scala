package Tutorial_03

object Question_09 extends App {
  // Operations supported by the calculator
  def addition(first: Int, second: Int) = first + second
  def subtraction(first: Int, second: Int) = first - second
  def multiplication(first: Int, second: Int) = first * second
  def division(first: Int, second: Int) = first / second

  // Test run
  println("Please enter the operation which you need to perform: ")
  println("1. Addition")
  println("2. Subtraction")
  println("3. Multiplication")
  println("4. Division")

  val choice = scala.io.StdIn.readInt()

  if(choice == 1){
    print("Please enter the first operand: ")
    val firstOperand = scala.io.StdIn.readInt()
    print("Please enter the second operand: ")
    val secondOperand = scala.io.StdIn.readInt()

    println(s"$firstOperand + $secondOperand = ${addition(firstOperand, secondOperand)}")
  }else if(choice == 2){
    print("Please enter the first operand: ")
    val firstOperand = scala.io.StdIn.readInt()
    print("Please enter the second operand: ")
    val secondOperand = scala.io.StdIn.readInt()

    println(s"$firstOperand - $secondOperand = ${subtraction(firstOperand, secondOperand)}")
  }else if(choice == 3){
    print("Please enter the first operand: ")
    val firstOperand = scala.io.StdIn.readInt()
    print("Please enter the second operand: ")
    val secondOperand = scala.io.StdIn.readInt()

    println(s"$firstOperand * $secondOperand = ${multiplication(firstOperand, secondOperand)}")
  }else if(choice == 4){
    print("Please enter the first operand: ")
    val firstOperand = scala.io.StdIn.readInt()
    print("Please enter the second operand: ")
    val secondOperand = scala.io.StdIn.readInt()

    println(s"$firstOperand / $secondOperand = ${division(firstOperand, secondOperand)}")
  }else{
    println("Invalid choice!")
  }
}
