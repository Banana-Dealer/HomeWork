package loops

fun main() {
    var a = 23
    var b = 33
    var s = 0
    while (a != 0 && b != 0){
        if (a >= b){
            a=a%b
        }
        else b=b%a
    }
    s = a + b
    println(s)
}