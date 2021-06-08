// main functio
fun main() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val evenList = numberList.filter { it % 2 == 0 }
    val notEvenList = numberList.filterNot { it % 2 == 0 }

    println(evenList)
    println(notEvenList)
}