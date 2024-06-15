
fun transformList(strings: List<String>, transformer: (String) -> String): List<String> {
    
    return strings.map { transformer(it) }
}


fun main() {
    val originalList = listOf("apple", "banana", "cherry")

    
    val capitalizeTransformer: (String) -> String = { it.capitalize() }

    
    val transformedList = transformList(originalList, capitalizeTransformer)

  
    println("Original List: $originalList")
    println("Transformed List: $transformedList")
}
