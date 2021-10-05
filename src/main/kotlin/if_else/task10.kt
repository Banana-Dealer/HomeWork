package if_else

fun main() {
    val x = 32
    val f: Int
    if (x < -2 || x > 2) {
        f = 2 * x
        println(f)
    }
    else {
        f = -3 * x
        println(f)
    }
}