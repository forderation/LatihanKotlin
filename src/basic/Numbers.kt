package basic

fun main(){
    var maxInt = Integer.MAX_VALUE
    val maxByte = Byte.MAX_VALUE
    val maxDouble = Double.MAX_VALUE
    println("max int: $maxInt , max double:$maxDouble.to, casting max Byte to int : ${maxByte.toInt()}")
    maxInt += 2
    println("overflow int $maxInt")
    val readableVal = 1_200_000
    println("terbilang satu juta dua ratus ribu $readableVal")
}