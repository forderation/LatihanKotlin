package functional

fun main(){
    val listNum = (1..10).toList()
    //fold menggunakan initial 5 kemudian diikuti lambda expression
    val fold = listNum.fold(5){ current,item->
        println("current item is $current")
        println("item now is $item")
        current+item
    }
    println(fold)
    //fold from right, current merupakan value dalam list, item merupakan nilai dihitung dari initial fold
    val rightFold = listNum.foldRight(1){
        current,item ->
        println("now current on $current")
        current+item
    }
    println(rightFold)
    //drop function untuk memangkas list
    val dropList = listNum.drop(3)
    println(dropList)
    //take merupakan kebalikan dari drop mengambil sejumlah n dari depan
    val takeList = listNum.take(5)
    println(takeList)
    //slice merupakan fungsi dari koleksi untuk mengambil nilai dari index i sampai index i
    val sliceList = listNum.slice(3..6)
    println(sliceList)
    //slice juga bisa menggunakan index yang dalam list yang sudah ditentukan
    val index = listOf(1,3,5,7)
    val sliceIdx = listNum.slice(index)
    println(sliceIdx)
    //distinc merupakan fungsi untuk menghilangkan nilai ganda sehingga list menjadi unique
    val uniqueList = listOf(1,1,2,4,1,2,3,3,5,6,7,6,9,0,2).distinct()
    println(uniqueList)
    distinctItems.forEach {
        println("key: ${it.key}, value: ${it.value}")
    }
    //fungsi chunked sebagai pemecah string menjadi beberapa bagian kecil array
    val namaku = "kharisma muzaki ghufron"
    val chunked = namaku.chunked(3){
        it.toString().toUpperCase().replace(" ","_")
    }
    println(chunked)
}

//data class sebagai praktik distinct, NOTE: tidak bisa digunakan dalam object Map
data class UserDistinct(val key:String,val value:Int)
val items = listOf(
    UserDistinct("A",1),
    UserDistinct("B",2),
    UserDistinct("A",2),
    UserDistinct("A",1),
    UserDistinct("C",3),
    UserDistinct("C",4)
)
val distinctItems = items.distinctBy { it.key }
