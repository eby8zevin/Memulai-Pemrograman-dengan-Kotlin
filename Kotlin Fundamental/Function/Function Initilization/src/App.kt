// main function
fun main() {
    val user = setUser("Ahmad Abu Hasan", 23)
    println(user)

    printUser("Ahmad Abu Hasan")
}

fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

fun printUser(name: String) {
    println("Your name is $name")
}