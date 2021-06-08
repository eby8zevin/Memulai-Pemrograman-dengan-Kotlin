// main function
fun main() {
    loop@ for (i in 1..10) {
        println("Outsid Loop")

        for (j in 1..10) {
            println("Inside Loop")
            if ( j > 5) break@loop
        }
    }
}