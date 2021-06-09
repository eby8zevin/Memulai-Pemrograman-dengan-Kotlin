// main function
fun main() {
    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String

    try {
        someMustNotNullValue = someNullValue!!
    } catch (e: Exception) {
        someMustNotNullValue = "Nilai String Nul"
    } finally {
        println(someMustNotNullValue)
    }
}