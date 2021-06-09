// main function
fun main() {
    val length = messageLength("Hello From lambd")
    println("Message length $length")
}

val messageLength = { message: String -> message.length }