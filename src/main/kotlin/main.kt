//fun main(){
//    println("Hello World")

//    var myVariable:Int =15
//    println(myVariable)

//    var myVariable:Int =15
//    println("The value of my variable is $myVariable")

//    var myVariable:Int =15
//    myVariable=7
//    println("The value of my variable is $myVariable")

//    val myVariable:Int =15
//    println("In Val values can't be overwritten $myVariable")

//    var myVariable:Boolean=true
//    println("The value of my variable is  $myVariable")
//    myVariable=false
//    println("The value of my variable is now  $myVariable")

//    var myVariable:String="Kshitij"
//    println("Hi, I am $myVariable")
//    var myVariableName: Int=21
//    println("and i am  $myVariable years old")

//    val String="This is a string"
//    println(String)

//    val String="This is a string"
//    println("The value of string is $String")

//    val String="This is a string"
//    println("The value of string is ${String.length}")

//    val String="Kshitij"
//    println("The string in upper case and reverse is ${String.uppercase().reversed()}")

//val x=3
//    test()

//    printPower(3,2)

//   val pow= printPower(3,2)
//    println("3 to the power 2 is $pow")

//    Addnum(1,6)

//    println(multiply(4,6))

//    var myList = mutableListOf<Int>(1,2,6,4,5,3)
//    println("Enter a number")
//    var userInput = readLine()?.toInt()
//    val result =numberList(myList, userInput!!)
//    println("The index of $userInput is $result")
//}

//fun printPower(base: Int,exponent:Int):{
//var result=1
//    for(i in 1 .. exponent){
//        result*=base
//    }
//    println("$base to power of $exponent is $result" )
//}

//fun printPower(base: Int,exponent:Int):Int{
//    var result=1
//    for(i in 1 .. exponent){
//        result*=base
//    }
//    return result
//}

//fun test(){
//    println("Hello")
//    println("Hi")
//}

//fun Addnum(base:Int,num:Int){
//    var sum=0
//    for(i in 1.. num){
//        sum+=i
//    }
//    println(sum)
//}

//fun multiply(a:Int,b:Int)=a * b
//fun numberList(list: List<Int>,num: Int):Int{
//    var indexNumber = 0
//    while(indexNumber < list.count()){
//        if(list[indexNumber] == num){
//            break
//        }
//        indexNumber++
//    }
//    return indexNumber
//
//}


//fun main(){
//    val list= listOf(1,2,3,4,5)
//    val array= arrayOf(1,2,3,4,5)
//    println("List $list")
//    printAlternately(array)
//}
//
//fun printAlternately(list: List<Int>){
//var i=0
//    var j=list.size-1
//    var toggle=true
//    while(i<=j){
//        if(toggle){
//            println(list[i])
//            i++
//        }
//        else{
//            println(list[j])
//            j--
//        }
//        toggle=! toggle
//    }
//}
//
//fun printAlternately(array:Array<Int>){
//    var i=0
//    var j=array.size-1
//    var toggle=true
//    while(i<=j){
//        if(toggle){
//            println(array[i])
//            i++
//        }
//        else{
//            println(array[j])
//            j--
//        }
//        toggle=! toggle
//    }
//}


fun main(){
    val a=3.0
    val b=4.0
    val height=2.0
    var parallelogram=object : Shape("parallelogram",a,b,height){

        init {
            println("The parallelogram is created with side a=$a , b=$b and height h=$height")
            println("Area is ${area()}")
            println("Perimeter is ${perimeter()}")
        }
        override fun area(): Double {
           return  a * height
        }

        override fun perimeter(): Double {
    return  2 * a + 2 * b
        }

    }
}