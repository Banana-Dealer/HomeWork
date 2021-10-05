package if_else

fun main() {
    val x = 5
    val f:Int
    if (x <= 0){
        f = -x
        println(f)
    }
    else if (x > 0 && x < 2){
        f = x*x
        println(f)
    }
    else {
        f = 4
        println(f)
    }
}