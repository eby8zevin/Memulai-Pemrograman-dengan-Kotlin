// main function
fun main() {
    val ranges = 1.rangeTo(10) step 3

    ranges.forEachIndexed { index, value ->
        println("valu $value with index $index")
    }
}