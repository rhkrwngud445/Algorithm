import java.util.Scanner

fun main() {
    with(Scanner(System.`in`)) {
        val result = mutableListOf<Int>()
        val primeNumber = mutableSetOf(2)
        var input = nextLine().toInt()
        var count = 2
        while (true) {
            if (input < primeNumber.last()) {
                break
            }
            if (input % count == 0) {
                result.add(count)
                primeNumber.add(count)
                input /= count
            } else {
                count++
            }
        }
        result.forEach {
            println(it)
        }
    }
}
