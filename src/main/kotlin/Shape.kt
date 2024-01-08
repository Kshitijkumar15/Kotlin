import java.awt.Dimension

open class Shape(var name: String) {

    init {
        println("I am the super class")
    }


    fun changeName(newName: String){
        name =newName
    }
}

abstract class Shapes(var name: String) {
constructor (name:String, vararg dimensions: Double):this(name)
    init {
        println("I am the super class")
    }

    abstract  fun area():Double
    abstract  fun perimeter():Double
    fun changeName(newName: String){
        name =newName
    }
}