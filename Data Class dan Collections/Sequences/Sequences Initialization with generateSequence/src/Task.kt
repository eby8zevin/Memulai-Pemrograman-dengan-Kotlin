fun main() {
    val sequenceNumber = generateSequence(1) { it + 1 }
    sequenceNumber.take(6).forEach { print("$it ") }
}