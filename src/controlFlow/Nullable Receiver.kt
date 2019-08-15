package controlFlow

fun main(){
    println(10.slice)
    println(null.slicer)
}

//menggunakan elvis operator
val Int?.slice:Int
        get() = this?: 0/2

//menggunakan if else
val Int?.slicer:Int
    get() = if(this==null) 0 else 2