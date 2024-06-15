data class Person(val name: String, val age: Int)

fun main() {
    val people = listOf(
        Person("Alice", 30),
        Person("Bob", 25),
        Person("Charlie", 35),
        Person("David", 28)
    )

    val sortedPeople = sortByAge(people)
    sortedPeople.forEach { println("${it.name} - ${it.age}") }
}

fun sortByAge(people: List<Person>): List<Person> {
    return people.sortedBy { it.age }
}
