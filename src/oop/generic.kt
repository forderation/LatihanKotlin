package oop

class LongList: List<Long>{
    override fun get(index: Int): Long {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

class ArrayList<T>() : List<T>{
    override fun get(index: Int): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

interface List<T>{
    operator fun get(index: Int):T
}

fun main(){
    val arrList = ArrayList<Long>()
    val listNumber = (1..100).toList()
    println(listNumber.slice(1..10))
}

fun <T : Number> List<T>.sumNumber() : Number {
    return 0
}