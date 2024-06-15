import kotlinx.coroutines.*

fun main() = runBlocking {
    try {
        withTimeout(2000L) { 
            performLongRunningTask()
        }
    } catch (e: TimeoutCancellationException) {
        println("Task timed out and was cancelled")
    }
}

suspend fun performLongRunningTask() {
    println("Starting long-running task")
    for (i in 1..5) {
        println("Processing part $i")
        delay(1000L) 
    }
    println("Task completed")
}
