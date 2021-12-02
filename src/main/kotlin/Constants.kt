const val PI_VALUE = 3.14

fun main(){
    println(PI_VALUE * 13)
    println(multiply(5.0,6.0))
    val myMessage = "sample"
    println(myMessage.drop(1).dropLast(1))
}

fun multiply(x: Double, y: Double):Double = x * y