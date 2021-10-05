package if_else

fun main() {
    val a = 3
    val b = 22
    val c = -1
    if (a<b && a<c) {
        println(a)
    }
    else if (b<c){
        println(b)
    }
    else println(c)
}