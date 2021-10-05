package input_output

fun main() {
    val r1 = 14
    val r2 = 6
    val PI = 3.14F
    val s1 = PI*(r1*r1)
    val s2 = PI*(r2*r2)
    val s3 = s1 - s2
    if (r1>r2) {
        println("Ploscha kola S1 =$s1")
        println("Ploscha kola S2 =$s2")
        println("Ploscha kola S3 =$s3")
    }
    else println ("Not today")
}