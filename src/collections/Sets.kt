package collections

//set merupakan collection dengan setiap value unique
fun main(){
    val integerSet = setOf(1,1,2,3,4) //otomatis akan menjadi 1,2,3,4
    for(i in integerSet){
        println(i)
    }
    val compareSet = setOf(3,2,4,1)
    println(integerSet == compareSet)
    println(7 in compareSet) //check value with in
    /*
    data Union mengetahui gabungan dan Intersect untuk mengetahui dua irisan
     */
    val dataA = setOf(1,3,5,6,78,2)
    val dataB = setOf(1,2,10,12,45,3)
    val uni = dataA.union(dataB)
    val inter = dataB.intersect(dataA)
    println(uni)
    println(inter)
}