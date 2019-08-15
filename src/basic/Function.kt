package basic

fun main(){
    println(setUser("Kharisma", 12))
    println(setUser("Kharisma", 12.1231))
    unitFunction("testing unit")
    val a = 1
    val boolRes = if(1==a){
        5
    }else{
        6
    }
    println(boolRes)
}

fun setUser(name:String,age:Int):String{
    return "My name is $name and iam $age years old"
}

//expression body function
fun setUser(name:String,age:Double) = "Your name is $name, and you $age years old"

//Unit function with no type Return in declaration
fun unitFunction(msg:String){
    println("this $msg has print in unit function")
}
