package collections

fun main(){
    val numberList = listOf(1,2,3,4,5,6,7,8,9,10)
    val evenList = numberList.filter { it%2 ==0 }
    val notEventList = numberList.filterNot { it%2==0 }
    println("even list : $evenList")
    println("odd list : $notEventList")
    val multipliedBy5 = numberList.map { it * 5 }
    val totalIdx = numberList.count()
    println("result multiplied $multipliedBy5 and total $totalIdx")
    //count by even number
    val totalEven = numberList.count { it % 2 == 0 }
    println(totalEven)
    //find sama dengan firstOrNull jika nilai found maka akan return
    print("find and firstOrNull")
    println(numberList.find { it % 5 == 0 })
    println(numberList.firstOrNull())
    val charList = listOf("k","o","t","l","i","n")
    println(charList.sorted())
}