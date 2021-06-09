fun main() {
    val message: String? = null
    message?.let {
        val length = it.length * 3
        val text = "text length $length"
        println(text)
    }.run {
        val text = "message is null"
        println(text)
    }
}