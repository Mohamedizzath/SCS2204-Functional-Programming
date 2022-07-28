package Tutorial_04

// Defining case class for Car
case class Car(name: String, price: Double)

// classUUID constructor
class classUUID(val uuid: String){
  // Custom constructor for getting car object
  def this(car: Car) = {
    // Getting uuid
    this(s"${car.name} - ${car.name.hashCode()}")
  }
}

object Question_03 extends App {
  // Creating the list of cars
  val cars = Array(Car("bmw 3 series", 20000), Car("bmw 5 series", 50000), Car("vw passat", 10000), Car("vw golf", 12000), Car("mazda", 15000))

  cars.foreach(car => {
    println(s"car uuid = ${new classUUID(car).uuid}")
  })
}
