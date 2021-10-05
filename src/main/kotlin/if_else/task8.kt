package if_else

fun main() {
    val a = 22
    val b = 33
    val c = 25
    if (a > c && a > b && c > b){
        println(c)
    }
    else if (b > a && b > c && a > c) {
        println(a)
    }
    else if (c > a && c > b && a > b){
        println(a)
    }
    else
        println(b)
}