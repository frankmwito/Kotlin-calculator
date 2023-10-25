fun main(){

    println("Enter two numbers:")
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()

    val operators = listOf("+", "-", "*", "/", "%")

    println("Choose an operator:")
    val operator = readLine()
    if (operator in operators) {
        when (operator) {
            "*" -> println("The multiplication is ${a * b}")
            "+" -> println("The addition is ${a + b}")
            "-" -> println("The subtraction is  ${a - b} || ${b - a}")
            "/" -> println("The division is $(a/b} || ${b/a}")
            "%" -> println("The remainder is ${a % b} || ${b % a}")
        }
    }
    else{
        println("Invalid operator")
    }
}