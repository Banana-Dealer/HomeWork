package if_else

fun main() {
    val n = 1300
    if ((n % 100) == 0 && ((n % 400)!=0)){
        println("366")
    }
    else if ((n % 4 ) == 0) {
        println("365")
    }
}