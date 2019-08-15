package controlFlow

fun main(){
    println(testingVararg(1,2,4,5,6))
    val listNum  = asList("A","B","C",1,2,3)
    listNum.forEach { println(it) }
}
//generic parameter vararg
fun <T> asList (vararg input: T):List<T>{
    val result = ArrayList<T>()
    for(item in input){
        result.add(item)
    }
    return result
}

fun testingVararg(vararg number:Int):Int = number.sum()

