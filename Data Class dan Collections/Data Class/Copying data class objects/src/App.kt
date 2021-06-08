data class DataUser(val name : String, val age : Int)

fun main(){
    val dataUser = DataUser("Ahmad Abu Hasan", 23)
    val dataUser2 = DataUser("Ahmad Abu Hasan", 23)
    val dataUser3 = DataUser("Eby", 24)
    val dataUser4 = dataUser.copy()

    println(dataUser4)
}