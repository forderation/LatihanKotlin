package collections

import controlFlow.DataUser

fun main(){
    //implicit declaration
    val numberList : List<Int> = listOf(1,2,3,4,5,6)
    numberList.forEach { x -> x+2 }
    //explicit declaration
    val charList = listOf('A','B','C')
    println("first index ${charList[0]}")
    val data = DataUser("zakai", 21)
    val listAny =  listOf("A",data,1,2,4)
    listAny.forEach { x -> println(x)}
    //List merupakan data mutable
    //jika ingin menggunakan sebagai immutable
    val anyList = mutableListOf("a","b",1,2,3)
    anyList[0] = "A"
    println(anyList[0])
}