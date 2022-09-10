package Tutorial_07

class Account(bal: Double) {
  var balance: Double = bal

  // Credit money to the account
  def credit(amount: Double): Unit = this.balance += amount

  // Debit money from the account
  def debit(amount: Double): Boolean =
    if(balance > amount) {
      balance -= amount
      true // To represent that debit process is completed
    }else{
      false // To represent that debit process is failed
    }

  // Transfer money from given account to the current account
  def transfer(amount: Double, other: Account): Boolean =
    if(other.balance > amount) {
      other.debit(amount)
      this.credit(amount)
      true
    }else{
      false
    }

  // Printing the account
  override def toString() = s"Balance is Rs.${this.balance}"
}
