package collections

//collection sets merupakan immutable modifier
fun main(){
    val maps = mapOf(
        "Jakarta" to "Indonesia",
        1 to "Ganjil",
        "Genap" to 2,
        "Black" to "White"
    )
    val black = maps["Black"]
    println(black)
    println(maps.keys)
    println(maps.values)
    //mengubah ke mutable value
    val mapImmu = maps.toMutableMap()
    mapImmu[3] = "Ganjil"
    println(mapImmu)
}