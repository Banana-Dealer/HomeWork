package loops

fun main() {
    var n = 5
    val a1 = 1
    val a2 = 2
    var a3 = 3
    for (i in 4..n){
        a3 = a3+a2-2*a1
        println(a3)
    }
}