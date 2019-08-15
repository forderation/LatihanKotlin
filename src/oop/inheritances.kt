package oop

//open digunakan sebagai final
open class Animal(val name:String,var age:Int, val weight:Double, val isMammal:Boolean){
    open fun eat(){
        println("$name do eating")
    }
    open fun sleep(){
        println("$name do sleeping")
    }
    fun death(){
        age = 0
    }
}

class Cat(name: String,age: Int,weight: Double, isCarnivore: Boolean):Animal(name,age,weight,isMammal = true){
    override fun eat() {
        println("cat doing eat at floor")
    }
    override fun sleep() {
        println("cat sleep at home")
    }
}

fun main(){
    val cat = Cat("kitty",10,12.2,true)
    cat.eat()
    cat.sleep()
    cat.death()
    println("${cat.age}")
}