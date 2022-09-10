package Tutorial_07

object Question_03 extends App {
  // Driver program to transfer money from one account to another
  var firstAccount = new Account(700)
  var secondAccount = new Account(770)

  // Perform the transaction
  val result = firstAccount.transfer(1000, secondAccount)
  if(result) println("Transaction completed")
  else println("Transaction failed")
  println(s"Balance of first account = ${firstAccount.balance}")
  println(s"Balance of second account = ${secondAccount.balance}")
}
