package Tutorial_04

// Case class for each product item
case class Item(name: String, price: Double, quantity: Int)

object Question_02 extends App {
  // Method for printing the items
  def printCartItems(items: Array[Item]): Unit = items.foreach((item) => println(s"${item.quantity} ${item.name} at Rs. ${item.price} each"))

  // Method for printing message for each item and generic message for others
  def checkVanillaItems(items: Array[Item]): Unit = items.foreach((item) => if(item.name.toLowerCase().contains("vanila")){
    println(s"${item.quantity} ${item.name} at Rs. ${item.price} each")
  }else{
    println("Found another item")
  })

  val listofItems = Array(Item("Vanilla ice cream", 3.99, 13), Item("Chocolate biscuits", 4, 6), Item("Cupccakes", 7.77, 7))

  // Print every item in the cart
  printCartItems(listofItems)

  // Check for only the vanilla items
  checkVanillaItems(listofItems)
}
