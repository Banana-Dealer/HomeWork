package loops

fun main() {
    val a = 25
    val n = 5
    var p = 1
    for (i in 1..n){
        p = p * a
        println(p)
    }
}