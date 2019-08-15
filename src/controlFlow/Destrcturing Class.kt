package controlFlow

fun main(){
    var newData  = DataUser("Kharisma",null)
    val name = newData.component1()
    val age = newData.component2()
    val (newName , newAge) = newData
    println("my name is $name and iam $age years old")
    println("testing with casting together name: $newName, age: $newAge")
    newData.age = 21
    newData.myAge()
}