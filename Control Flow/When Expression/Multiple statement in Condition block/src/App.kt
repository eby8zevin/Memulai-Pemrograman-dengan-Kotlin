// main function
fun main() {
    val value = 7
    val stringOfValue = when (value) {
        6 -> {
            println("Six")
            "value is 5"
        }
        7 -> {
            println("Seven")
            "value is 7"
        }
        8 -> {
            println("Eight")
            "value is 8"
        }
        else -> {
            println("undefined")
            "value cannot be reached"
        }
    }

    println(stringOfValue)
}
