// main function
fun main() {
    val ranges = 1.rangeTo(10) step 3

    for ((index, value) in ranges.withIndex()) {
        println("valu $value with index $index")
    }
}