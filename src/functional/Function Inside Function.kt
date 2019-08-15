package functional

import java.lang.IllegalArgumentException

fun main(){
    val resultSum = sumOf(10,10,10)
    println(resultSum)

}

fun sumOf(valueA:Int,valueB:Int,valueC:Int):Int{
    fun validateNum(value:Int){
        if(value==0) throw IllegalArgumentException("number must be better than 0")
    }
    //extension function
    fun Int.validateNum(){
        if(this==0) throw IllegalArgumentException("number must be better than 0")
    }
    validateNum(valueA)
    validateNum(valueB)
    valueC.validateNum()
    return valueA+valueB+valueC
}