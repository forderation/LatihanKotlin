package oop

class AnimalNew(pName:String, pWeight: Double, pAge: Int){
    val name:String
    val weight:Double
    val age:Int
    var isMammal:Boolean
    //late init tidak
    lateinit var animalRec : AnimalNew
    init {
        name = if(pName.isEmpty()) "Empty" else pName
        weight = if(pWeight<0) 0.1 else pWeight
        age = pAge
        isMammal = false
    }
    //Overloading constructor
    constructor(name:String,weight:Double,age:Int,isMammal:Boolean):this(name,weight,age){
        this.isMammal = isMammal
    }
    fun setupAnimalRec(animal:AnimalNew){
        this.animalRec = animal
    }

}

fun main(){
    val newAnim = AnimalNew("",-1.0,4,true)
    println("${newAnim.name},${newAnim.weight},${newAnim.age},${newAnim.isMammal}")
    val fish = AnimalNew("Fisihhy",2.2,3)
    fish.setupAnimalRec(fish)
    println("fish is mammal ? ${fish.isMammal}")
}