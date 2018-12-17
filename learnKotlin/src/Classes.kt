//class Car constructor(make: String, model: String) {
//    val make = make
//    val model = model
//}

//class Car constructor(val make: String, val model: String){
//
//}

open class Vehicle(val make: String, val model: String) {
    open fun accelerate() {
        println("vroom vroom")
    }

    fun park() {
        println("parking the vehicle")
    }

    fun brake() {
        println("STOP")
    }
}

class Car(make: String, model: String, var color: String) : Vehicle(make, model) {
    override fun accelerate() {
        println("We are going ludicrous model")
    }
}

class Truck(make: String, model: String, val towingCapacity: Int) : Vehicle(make, model) {
    fun tow() {
        println("headed out to the mountains")
    }
}




fun main(args: Array<String>) {
//    var car = Car("Toyota", "Crown")
    val tesla = Car("Tesla", "ModelS", "Red")
    tesla.accelerate()

    val truck = Truck("Ford", "ESCAPE", 10000)
}