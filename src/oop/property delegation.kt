package oop

import kotlin.reflect.KProperty

class DelegateName{
    private var value:String = "Default"
    operator fun getValue(classRef: Any?, property: KProperty<*>):String{
        println("fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }
    operator fun setValue(classRef: Any?,property: KProperty<*>, newValue: String){
        println("fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class AnimalDele{
    var name: String by DelegateName()
}

class Person{
    var name: String by DelegateName()
}

class Hero{
    var name: String by DelegateName()
}

fun main(){
    val animal = AnimalDele()
    animal.name = "new animal"
    println("animal name is ${animal.name}")
    val person = Person()
    person.name = "kharisma"
    println("person name is ${person.name}")
    val hero = Hero()
    hero.name = "captain marvel"
    println("name hero is ${hero.name}")
}