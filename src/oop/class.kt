package oop

class ClassAnimal (val name:String, val weight:Double, val age:Int, val isMammal:Boolean){
    fun eat(){
        println("$name makan")
    }
    fun sleep(){
        println("$name sleep")
    }
}

//extension properties, hanya bisa dilakukan diluar kelas, karena penggunaannya adalah secara eksplisit
val ClassAnimal.getAnimalInfo:String
    get() = "nama $name, berat $weight, umur $age, mamalia $isMammal"

fun main(){
    val dicodingCat = ClassAnimal("Miaw",4.2,2,true)
    println("Name: ${dicodingCat.name}, weight : ${dicodingCat.weight}, age: ${dicodingCat.age}, isMammal: ${dicodingCat.isMammal}")
    dicodingCat.eat()
    dicodingCat.sleep()
    val cat = MutableAnim()
    cat.namaHewan = "Meow"
    cat.umurHewan = 10
    println("hewan adalah ${cat.namaHewan}, umurnya ${cat.umurHewan}")
    println(dicodingCat.getAnimalInfo)
}

class MutableAnim{
    var namaHewan: String = ""
        get() {
            return "nama hewan adalah $field"
        }
        set(value) {
            field += value
        }
    var umurHewan: Int = 0
}