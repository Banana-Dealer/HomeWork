package loops

fun main() {
    val p = 2
    var k = 1
    var s = 1000
    while (s <= 1100){
        s = s + (p / 100 + 1)
        k = k + 1
    }
    println("Kilkist mis. = $k, vklad = $s grn")
}