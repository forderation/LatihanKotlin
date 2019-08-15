package basic

fun main(){
    val open = 7
    val close = 21
    var now = 23
    val isOpen = now >= open && now <= close
    println("is now open $isOpen")
    //boolean in range
    val isOpenInRange = now in open..close
    print(isOpenInRange)
}