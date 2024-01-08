//class Triangle(
//    val a: Int,
//    val b:Int,
//    val c:Int
//) {
//    init {
//        println("circle created with sides $a, $b, $c")
//        println("The area of triangle is ${area()}")
//        println("The perimeter of triangle is ${perimeter()}")
//    }
//    fun area()= 0.5 * b * c
//    fun perimeter()=a * b * c
//
//    fun sqrt()=((perimeter()/2 * ((perimeter()/2)-a) * ((perimeter()/2)-b) * ((perimeter()/2)-c)))
//}


class Triangle(
    val a: Int,
    val b:Int,
    val c:Int
) :Shape("Triangle"){
    init {
        println("$name created with sides $a, $b, $c")
        println("The area of $name  is ${area()}")
        println("The perimeter of $name  is ${perimeter()}")
    }
    fun area()= 0.5 * b * c
    fun perimeter()=a * b * c

    fun sqrt()=((perimeter()/2 * ((perimeter()/2)-a) * ((perimeter()/2)-b) * ((perimeter()/2)-c)))
}