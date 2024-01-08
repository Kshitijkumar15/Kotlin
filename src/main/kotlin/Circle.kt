import kotlin.random.Random

//class Circle(
//    val radius:Double
//) {
//    val pi=3.141592
//init {
//    println("circle created with radius $radius")
//    println("The area of circle is ${area()}")
//    println("The perimeter of circle is ${perimeter()}")
//}
//    fun area()=radius * radius * pi
//    fun perimeter()=2 * pi * radius
//}

//class Circle(
//    val radius:Double
//):Shape("Circle") {
//
//    init {
//        println("$name created with radius $radius")
//        println("The area of $name is ${area()}")
//        println("The perimeter of $name  is ${perimeter()}")
//    }
//    fun area()=radius * radius * ImportantNumbers.PI
//    fun perimeter()=2 * ImportantNumbers.PI * radius
//}

class Circle(
    val radius:Double
):Shape("Circle") {
    companion object{
        fun rondomCircle(): Circle{
            val radius= Random.nextDouble(1.0,10.0)
            return Circle(radius)
        }

    }

    init {
        println("$name created with radius $radius")
        println("The area of $name is ${area()}")
        println("The perimeter of $name  is ${perimeter()}")
    }
    fun area()=radius * radius * ImportantNumbers.PI
    fun perimeter()=2 * ImportantNumbers.PI * radius
}