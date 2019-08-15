package functional

fun main(){
    println(facto(5))
    println(factorial(10))
}

//traditional recursion, stack overflow error jika terlalu banyak nilai yang dipanggil
fun factorial(value:Int):Int{
    return if(value==1){
        value
    }else{
        value * factorial(value-1)
    }
}

//solusi untuk stack overflow error menggunakan tailrec
tailrec fun facto(value:Int, result: Int=1):Int{
    return if(value==1){
        result
    }else{
        facto(value-1,value*result)
    }
}