package oop
//dengan menggunakan abstract class, class tidak bisa dibuat menjadi objek
abstract class AnimalAbs(var name:String, var weight: Double, var age:Int, var isCarnivore:Boolean = false){
    fun eat(){
        println("$name sedang makan")
    }
    fun sleep(){
        println("$name sedang sleep")
    }
}

interface IFly{
    fun fly()
    fun maxDiving():Int
}

data class FlyFish(var pName: String,var pWeight: Double,var pAge: Int):AnimalAbs(pName,pWeight,pAge),IFly{
    override fun maxDiving(): Int {
        return 100
    }
    override fun fly() {
        println("Fish now in flying")
    }
}

data class Turtle(var pName: String,var pWeight: Double,var pAge: Int,var pIsCarnivore: Boolean):AnimalAbs(pName,pWeight,pAge,pIsCarnivore){
    fun hide(){
        println("turle sedang sembunyi dalam tempurung")
    }
}

fun main(){
    val hewan = Animal("hewan",10,12.2,true)
    val turtle = Turtle("Kiko",5.5,6,false)
    println(turtle)
    turtle.hide()
    turtle.eat()
    turtle.sleep()
    val flyFish = FlyFish("fishingfish",5.3,1)
    println(flyFish.maxDiving())
    println(flyFish.fly())
}