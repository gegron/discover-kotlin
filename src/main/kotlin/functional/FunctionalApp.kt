package functional

fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int):Int {
    return operation(a, b)
}

fun sum(a: Int, b: Int):Int = a + b

fun main() {
    val sumResult = calculate(3,2, ::sum)
    val multiplyResult = calculate(3,2) {a,b -> a*b}

    println("Sum result : $sumResult, multiply result : $multiplyResult")
}