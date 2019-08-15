package functional

fun main(){
    println(sum(10,10))
    val numbers = 1.rangeTo(10)
    val evenNumbers = numbers.filter(::isEvenNumbers)
    println(evenNumbers)
    val oddNumbers = numbers.filter(Int::isOddNumbers )
    println(oddNumbers)
    //property references dengan menggunakan KMutable
    println(::msg.name) //output: msg
    println(::msg.get())
    ::msg.set("New String Hello Kotlin")
    println(::msg.get())
}
//Reflection, mengamati kode struktur secara langsung
val sum: (Int,Int) -> Int = ::count
fun count(valueA: Int, valueB:Int):Int{
    return valueA+valueB
}
//Function references
fun isEvenNumbers(number: Int) = number%2==0

//Function references with object
fun Int.isOddNumbers() = this%2!=0

//property references
var msg = "Hello Kotlin"