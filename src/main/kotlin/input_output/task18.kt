package input_output

fun main() {
    var a = 13
    var b = 22
    println ("a=$a, b=$b")
    a = b.also { b = a }
    println ("a=$a, b=$b")
}