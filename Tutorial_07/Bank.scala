package Tutorial_07

class Bank(acc: List[Account]){
  // List of accounts
  val accounts: List[Account] = acc

  // Method for getting list of accounts balance is negative
  def getNegatives(): List[Account] = accounts.filter(account => account.balance < 0)

  // Getting sum of all accounts
  def getSum(): Double = accounts.filter(account => account.balance > 0).map(account => account.balance).reduce((first, second) => first + second)

  // Applying the interest
  // Interest function
  def interestFn(balance: Double) =
    if(balance > 0) balance * 0.05
    else balance * 0.1

  def applyInterest(): Unit = accounts.map(account => account.credit(interestFn(account.balance)))

  override def toString() = {
    val result = s"Details of the accounts in the bank\n"
    val other = accounts.map(account => account.toString() + "\n").reduce((first, second) => first + second)
    result + other
  }

}
