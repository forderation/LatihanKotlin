package basic

fun main(){
    val text = "Hello"
    //run, this merupakan akses ke dalam value yang ada di konteks variabel text
    val msg = text.run{
        val from = this
        val to = this.replace("Hello","Kotlin")
        "replace text from $from to $to"
    }
    println(msg)
    //menggunakan with dalam blok lambda sebagai receiver
    val newMsg = "Hello Kotlin!"
    val result = with(newMsg){
        val appendNew = "new string to append"
        "value of this new message is $this, with append: $appendNew"
    }
    println(result)
    //apply digunakan pada saat inisialisasi , atau sebagai konfigurasi receiver (this)
    val stringBuilder = StringBuilder().apply {
        append("Hello")
        append(" Apply")
        append(" It")
        append(" so in receiver is : $this")
    }
    println(stringBuilder)
    //penggunaan let dalam konteks non-null object
    val nonNull:String? = null
    val length = nonNull?.length ?:0
    val textLength = "text length is $length"
    println(textLength)
    //menjalankan kode lain menggunakan let
    nonNull?.let {
        val length = it.length * 2
        val text = "text length is $length"
        println(text)
    }.run {
        val text= "message is null"
        println(text)
    }
    nonNull.also {
        println("value length is ${it?.length}")
    }
}