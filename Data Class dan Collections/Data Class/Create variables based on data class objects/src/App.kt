data class DataUser(val name : String, val age : Int)

fun main(){
    val dataUser = DataUser("Ahmad Abu Hasan", 23)
    val (name, age) = dataUser

    println("My name is $name, I am $age years old")
}