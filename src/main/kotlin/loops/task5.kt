package loops

fun main() {
    val n = 7
    var f = 1
    for (i in 1..n){
        f = f * i
    }
    println("$n! = $f")
}