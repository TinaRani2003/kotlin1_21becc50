fun main() {
    
    val factorial: (Int) -> Long = { number ->
        
        fun fact(n: Int): Long {
            return if (n <= 1) 1 else n * fact(n - 1)
        }
       
        fact(number)
    }


    fun computeFactorial(number: Int): Long {
        return factorial(number)
    }


    val num = 5
    val result = computeFactorial(num)
    println("Factorial of $num is: $result")
}
