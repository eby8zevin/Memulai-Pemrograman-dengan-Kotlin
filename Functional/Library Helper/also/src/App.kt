// main function
fun main() {
    val text = "Hello Kotli"
    val result = text.also {
        println("value length -> ${it.length}")
    }

    println("text -> $result")
}