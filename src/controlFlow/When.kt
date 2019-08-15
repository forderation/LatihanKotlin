package controlFlow

fun main(){
    val value = 7
    when(value){
        7 -> println("value is 7")
        10 -> println("value is 10")
        else -> println("value cannot be reached")
    }
    //curly braces when
    val testing:Any = 10
    val valueOf = when(testing){
        10 -> {
            println("ten")
            "value is 10"
        }
        else -> {
            println("not reached")
            "null"
        }
    }
    //when use is
    val typeOf = when(testing){
        is Int -> {
            "value is int"
        }
        is Long -> {
            "value is long"
        }
        else -> "value not detected"
    }
    //when use in range
    val selected = 12
    val rangeL = 0..10
    val valIn = when(selected){
        in rangeL -> {
            "of course"
        }
        !in rangeL ->{
            "not in range"
        }
        else -> "not detected"
    }
    println(valIn)
    println(typeOf)
    println(valueOf)
}