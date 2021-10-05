package input_output

fun main() {
    var a = 3
    var b = 15
    var c = 5
    println ("a=$a, b=$b, c=$c")
    b = a
    c = b
    a = c
    println ("a=$a, b=$b, c=$c")
}