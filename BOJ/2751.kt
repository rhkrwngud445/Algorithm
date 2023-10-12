import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    print(List(this.readLine().toInt()) {this.readLine().toInt()}.sorted().joinToString("\n"))
}
