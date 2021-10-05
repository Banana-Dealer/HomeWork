package input_output

import kotlin.math.pow

fun main() {
    val x = 3.0
    val y = 4*(x-3).pow(6) - 7*(x-3).pow(3) + 2
    println("Y = $y")
}