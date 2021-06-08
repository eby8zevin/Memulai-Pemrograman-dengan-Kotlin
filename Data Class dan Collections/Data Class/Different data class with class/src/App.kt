class User(val name : String, val age : Int)

data class DataUser(val name : String, val age : Int)

fun main(){
    val user = User("Ahmad Abu Hasan", 23)
    val dataUser = DataUser("Ahmad Abu Hasan", 23)

    println(user)
    println(dataUser)
}