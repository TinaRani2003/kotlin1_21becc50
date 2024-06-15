fun processStrings(list: List<String>, startingLetter: Char): List<String> {
    return list
        
        .filter { it.startsWith(startingLetter, ignoreCase = true) }
        
        .map { it.toUpperCase() }

        .sorted()
}

fun main() {
    val listOfStrings = listOf("apple", "Banana", "Orange", "grape", "pear", "lemon")

    
    val startingLetter = 'b'

    
    val processedList = processStrings(listOfStrings, startingLetter)
    println("Processed List: $processedList")
}
