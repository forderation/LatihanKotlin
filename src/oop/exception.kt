package oop

import java.lang.NullPointerException
import java.lang.NumberFormatException

fun main(){
    var someNullValue: String? = null
    lateinit var someMustNotNullValue : String
    try{
        someMustNotNullValue = someNullValue!!
        println(someMustNotNullValue)
    }catch (e:NullPointerException){
        someMustNotNullValue = "Nilai string null"
    }finally {
        println(someMustNotNullValue)
    }
    var someIntValue: Int? = null
    try {
        someIntValue = someNullValue!!.toInt()
    }catch (e:NullPointerException){
        someIntValue = 0
    }catch (e:NumberFormatException){
        someIntValue = -1
    }finally {
        when(someIntValue){
            0 -> println("nilai null")
            -1 -> print("format penulisan salah")
            else -> println("tidak terdeteksi kesalahan, nilai: $someIntValue")
        }
    }
    someNullValue = "12"
    try {
        someIntValue = someNullValue!!.toInt()
    }catch (e:NullPointerException){
        someIntValue = 0
    }catch (e:NumberFormatException){
        someIntValue = -1
    }finally {
        when(someIntValue){
            0 -> println("nilai null")
            -1 -> print("format penulisan salah")
            else -> println("tidak terdeteksi kesalahan, nilai: $someIntValue")
        }
    }
}