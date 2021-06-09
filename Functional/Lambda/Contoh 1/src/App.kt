// main function
fun main() {
    printMessage("Hello From Lambd")
}

val printMessage = { message: String -> println(message) }