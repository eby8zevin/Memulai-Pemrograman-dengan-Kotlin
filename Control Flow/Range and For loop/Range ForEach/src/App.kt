// main function
fun main() {
    val rangeInt = 1..11 step 2

    rangeInt.forEach {
        print("$it ")
    }

    println(rangeInt.step)
}