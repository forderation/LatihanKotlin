package controlFlow

fun main(){
    val colors : Array<Color> = enumValues()
    colors.forEach { color -> println(color.getValue()) }
    val valueRed = enumValueOf<Color>("RED")
    println(valueRed.value)
    when(valueRed){
        Color.RED -> print("RED SELECTED")
        Color.BLUE -> print("BLUE SELECTED")
        Color.GREEN -> print("GREEN selected")
    }
}

enum class Color(val value:Int){
    RED(0xFF0000){
        override fun getValue(): String {
            return "value of RED is $value"
        }
    }
    ,BLUE(0x00FF00){
        override fun getValue(): String {
            return "value of BLUE is $value"
        }
    },
    GREEN(0x00FF00) {
        override fun getValue(): String {
            return "value of GREEN is $value"
        }
    };
    abstract fun getValue():String
}