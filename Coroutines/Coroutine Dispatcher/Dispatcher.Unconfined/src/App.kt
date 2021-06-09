import kotlinx.coroutines.*

@ExperimentalCoroutinesApi
fun main() = runBlocking<Unit> {
    launch(Dispatchers.Unconfined) {
        println("Startin in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
}