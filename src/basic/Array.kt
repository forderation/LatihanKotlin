package basic

fun main(){
    val arrayInt = intArrayOf(12,1,44,3,2)
    val doubleType = doubleArrayOf(12.1,34.4,223.2)
    arrayInt[0] = 1
    print(arrayInt[0])
    //Array with lambda function
    val lambdaArray = Array(4,{x -> x * 2})
    for(x in lambdaArray){
        print(x)
    }
    println(doubleType)
}