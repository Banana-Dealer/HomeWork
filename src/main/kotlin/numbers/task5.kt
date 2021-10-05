package numbers

fun main(){
    val a= 245
    val b:Int=a/100 /*2*/
    val c:Int=(a%100)/10
    val d:Int=(a%100)%10 /*5*/
    val n:Int=(d*100)+(c*10)+b
    println(a)
    println(n)
}