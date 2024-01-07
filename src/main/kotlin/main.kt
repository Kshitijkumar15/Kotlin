fun main(){
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

    var myList = mutableListOf<Int>(1,2,6,4,5,3)
    println("Enter a number")
    var userInput = readLine()?.toInt()
    val result =numberList(myList, userInput!!)
    println("The index of $userInput is $result")
}

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
fun numberList(list: List<Int>,num: Int):Int{
    var indexNumber = 0
    while(indexNumber < list.count()){
        if(list[indexNumber] == num){
            break
        }
        indexNumber++
    }
    return indexNumber

}