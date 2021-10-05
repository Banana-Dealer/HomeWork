package loops

fun main() {
    var n = 13
    var f1 = 1
    var f2 = 1
    var f = 0
    while (n > f2){
        f = f2
        f2= f1 + f2
        f1 = f
    }
    if (n == f2)
        println("true")
    else println("false")
}