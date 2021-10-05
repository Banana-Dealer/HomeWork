package if_else

fun main() {
    val a = 22
    val b = 11
    val c = 32
    println("Chuslo a = $a, b = $b, c = $c")
    if (a < b && a < c) {
        println(b+c)
    }
    else if (b < c){
        println(a+c)
    }
    else println(a+b)
}