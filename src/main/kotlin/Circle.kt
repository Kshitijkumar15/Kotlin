class Circle(
    val radius:Double
) {
    val pi=3.141592
init {
    println("circle created with radius $radius")
    println("The area of circle is ${area()}")
    println("The perimeter of circle is ${perimeter()}")
}
    fun area()=radius * radius * pi
    fun perimeter()=2 * pi * radius
}