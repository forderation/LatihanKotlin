package basic

fun main(){
    println(printMsg("world of simplified"))
    println(sum(10))
    printSum(2){ values ->
        values + values
    }
    val msg = buildString {
        append("Holla")
        append(" Kotlin")
        append(" From")
        append(" Indonesia")
    }
    println(msg)
    //with invoke if nullable
    println(sumType?.invoke(10,10))

}

val printMsg = {msg:String -> "hello $msg from kotlin"}

//high order function with return type
var sum:(Int) -> Int = {value -> value+value}

//high order function as parameter
fun printSum(values:Int, sumAs:(Int) -> Int){
    val result = sumAs(values)
    println("result of sum is $result")
}

//lambda with receiver (mirip extension function)
fun buildString(action: StringBuilder.() -> Unit):String{
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}

//function type
typealias Arithmetic = ((Int,Int) -> Int)?
val sumType:Arithmetic = {valueA,valueB -> valueA+valueB}