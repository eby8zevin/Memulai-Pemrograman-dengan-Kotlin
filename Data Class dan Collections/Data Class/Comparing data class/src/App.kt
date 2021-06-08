data class DataUser(val name : String, val age : Int)

fun main(){
    val dataUser = DataUser("Ahmad Abu Hasan", 23)
    val dataUser2 = DataUser("Ahmad Abu Hasan", 23)
    val dataUser3 = DataUser("Eby", 24)

    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))

}