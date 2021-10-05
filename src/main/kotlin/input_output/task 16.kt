package input_output

import kotlin.math.abs

fun main() {
    val x1 = 13
    val y1 = 22
    val x2 = 16
    val y2 = 7
    val a = abs(x2-x1)
    val b = abs(y2-y1)
    val p = 2*(a+b)
    val s = a*b
    println ("Perumetr = $p")
    println ("Ploscha = $s")
}