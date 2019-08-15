fun main(){
    var stringNull:String? = null
    //safe calls
    val lengthString = stringNull?.length
    //elvis operator
    val elvisString = stringNull?.length ?:10
    println(stringNull + " length string $lengthString"+ " elvis string $elvisString")
    //null pointer
    try {
        //non null assertion
        val assertionVal = stringNull!!.length
        print(assertionVal)
    }catch (e:NullPointerException){
        print(e)
    }
}