package controlFlow

data class DataUser(var name:String, var age:Int?){
    fun myAge(){
        println("my age now is $age years old")
    }
}

class User(val name:String, val age:Int){
    override fun toString(): String {
        return "name: $name, age: $age"
    }
    //override to checkin equals
    override fun equals(other: Any?): Boolean {
        if(this === other) return true
        if(javaClass != other?.javaClass) return false
        other as User
        if(name == other.name && age == other.age) return true
        return false
    }
}

fun main(){
    val user = User("zaki",21)
    val dataUser = DataUser("kharisma",17)
    println(user)
    println(dataUser)
    //testing automatic equals in data class
    val dataUser2 = DataUser("kharisma",17)
    val dataUser3 = DataUser("zaki",21)
    println(dataUser2.equals(dataUser))
    println(dataUser2.equals(dataUser3))
    println(user.equals(dataUser3))
    //copy form data class
    val newData = dataUser.copy(name = "kharisma muzaki ghufron", age = 21)
    println(newData)
}