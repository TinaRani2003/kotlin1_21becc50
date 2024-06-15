import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch {
        try {
            performTask()
        } catch (e: Exception) {
            println("Caught exception: ${e.message}")
        }
    }
    job.join() // Wait for the job to complete
}

suspend fun performTask() {
    println("Starting task")
    delay(500L) // Simulate a delay
    throw RuntimeException("Something went wrong") // Simulate an exception
}