class Rectangle (
    val a:Double,
    val b:Double)
{
init {
    println("The rectangle is created with side $a and side $b")
}

    fun area() = a * b
    fun perimeter() = 2 * a + 2 * b
    fun isSquare() = a==b
}