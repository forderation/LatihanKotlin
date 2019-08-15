package controlFlow

fun main(){
    var x = 0
    while(x<10){
        println("hello " + x*2)
        x++
    }
    val ranges = 1.rangeTo(5).step(3)
    for ((index,value) in ranges.withIndex()){
        println("ranges in $index and value: $value")
    }
    //for aech lambda function
    ranges.forEach { x ->
        println("ranges in value $x")
    }
    //for each indexed with no value
    val newRanges = 1.rangeTo(10).step(2)
    newRanges.forEachIndexed{x,_ -> println("index in new ranges $x")}
    val downRanges = 10.downTo(1).step(2)
    downRanges.forEach { valx -> println("downranges in $valx")}
    if(6 in downRanges){
        println("six is available")
    }
    //break with label
    loop@
    for (i in 1..10){
        println("outside loop")
        for(x in 1..5){
            println("inside loop")
            if(x == 4){
                break@loop
            }
        }
    }
}