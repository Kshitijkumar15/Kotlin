fun main(){
//    println("Enter a number")
//    val input= readln()?.toInt()
//    if(input!=null){
//        input.isPrime()
//        println("The $input is a prime number")
//    }
//    else
//    {
//        println("The $input is not a prime number")
//    }
    val list= listOf(1,2,3,4,5,6)
    val result= list.Product()
    println("The product of the numbers in list is $result")
}

fun List<Int>.Product():Int{
    var product=1
    for(i in this){
    product*=i
    }
    return product
}

//fun Int.isPrime():Boolean{
//    for(i in 2 until this-1){
//        if(this % i==0){
//            return false
//        }
//    }
//    return true
//}

