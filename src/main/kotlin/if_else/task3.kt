package if_else

fun main() {
    var n = -3
    if (n > 0) {
        n = n +1
        println(n)
    }
    else if (n == 0) {
        n = 10
        println(n)
    }
    else if ( n < 0 ){
        n = n - 2
        println(n)
    }
}