data class DataUser(val name : String, val age : Int)

fun main(){
    val dataUser = DataUser("Ahmad Abu Hasan", 17)
    val dataUser2 = DataUser("Ahmad Abu Hasan", 17)
    val dataUser3 = DataUser("Eby", 24)
    val dataUser4 = dataUser.copy()
    val dataUser5 = dataUser.copy(age = 18)

    println(dataUser4)
    println(dataUser5)
}