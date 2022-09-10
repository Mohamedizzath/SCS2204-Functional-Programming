package Tutorial_07

object Question_04 extends App {
  // Creating the set of accounts
  val accounts = List(new Account(1000), new Account(-250), new Account(2500), new Account(7200), new Account(-1000), new Account(1200))

  val bank = new Bank(accounts);

  // Getting accounts which has negative balance
  println("Accounts with negative values are follows:")
  println(s"${bank.getNegatives()}")

  // Getting sum of all accounts
  println(s"Sum of balances ${bank.getSum()}")

  // Adding interest
  println("Before applying interest")
  println(bank)
  bank.applyInterest()
  println("After applying interest")
  println(bank)
}
