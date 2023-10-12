import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    print(
        readLine().map {
            it.toString().toInt()
        }.sortedDescending().joinToString(""),
    )
}
