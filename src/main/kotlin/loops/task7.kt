package loops

fun main() {
    var n = 20
    val k = 5
    var r = 0
    while (n - k >= 0){
        n = n - k
        r = r + 1
    }
    println("CHastka = $r, ostacha = $n")
}