package basic

fun main(){
    val textString = "Hello Kotlin"
    val firstChar = textString[0]
    println("First of char is $firstChar")
    for(char in textString){
        print("$char")
    }
    println()
    println("Unicode is \u0394")
    val rawString = """
        test 1234
        this is
        raw string
    """.trimIndent()
    println("result of rawString : $rawString")
    //String template
    val hour = 7
    print("Office is ${if(hour > 7)"already close" else "is open"}")
}