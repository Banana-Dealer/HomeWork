package if_else

fun main() {
    var a = 23
    var b = 11
    var c:Int
    if (a!=b){
        c = a + b
        b = c
        a = c
        println("a = $a")
        println("b = $b")
    }
    else {
        b = 0
        a = 0
        println(" a = $a")
        println(" b = $b")
    }
}