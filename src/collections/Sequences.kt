package collections

fun main(){
    /*
    eager function
    proses dilakukan filter terlebih dahulu kemudian dilakukan mapping dan terakhir print
     */
    val list = (1..1_000_000).toList()
//    list.filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }
    /*
    lazy function merupakan proses bersyarat jika tidak memenuhi akan di skip langsung
     */
//    list.asSequence().filter { it % 5 ==0 }.map { it * 2 }.forEach { println(it) }
    /*
    proses generate sequence
     */
    val generateSequence = generateSequence (1){it + 2 }
//    generateSequence.take(10).forEach { println(it) }
}