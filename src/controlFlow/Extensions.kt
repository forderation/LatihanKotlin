package controlFlow

fun main(){
    10.printInt()
    println(17.plusThree())
    println(20.slice)
}

// extensions function
fun Int.printInt(){
    println("value is $this")
}

fun Int.plusThree():Int{
    return this + 3
}
/*
    extension tidak benar-benar mengubah sebuah kelas dengan menambahkan sebuah fungsi atau properti baru.
 */

//extension properties harus dilakukan dengan menyediakan getter atau setter secara eksplisit
val Int.slice:Int
    get() = this / 2