class UniqueList<T> {
    private val elements = mutableListOf<T>()

    fun add(element: T): Boolean {
        return if (!elements.contains(element)) {
            elements.add(element)
            true
        } else {
            false
        }
    }

    fun remove(element: T): Boolean {
        return elements.remove(element)
    }

    fun contains(element: T): Boolean {
        return elements.contains(element)
    }

    fun size(): Int {
        return elements.size
    }
}

fun main() {
    val uniqueList = UniqueList<Int>()

    println("Adding 1: ${uniqueList.add(1)}")  
    println("Adding 2: ${uniqueList.add(2)}")  
    println("Adding 1 again: ${uniqueList.add(1)}")  
    println("Unique list contains 2: ${uniqueList.contains(2)}")  
    println("Unique list contains 3: ${uniqueList.contains(3)}")

    println("Removing 2: ${uniqueList.remove(2)}") 
    println("Removing 2 again: ${uniqueList.remove(2)}")  
    println("Size of unique list: ${uniqueList.size()}")  
}