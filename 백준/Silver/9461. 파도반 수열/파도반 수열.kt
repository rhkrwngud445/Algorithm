import java.util.Scanner

fun main() {
    with(Scanner(System.`in`)) {
        val count = nextInt()
        val inputs = Array(count) {
            0
        }
        val result = mutableListOf<Long>(1, 1, 1, 2, 2, 3, 4, 5, 7, 9)
        repeat(count) {
            inputs[it] = nextInt()
        }
        repeat(inputs.max()) {
            when(it) {
                in 0..9 -> Unit
                else -> {
                    result.add(result[it-1] + result[it-5])
                }
            }
        }
        repeat(count) {
            println(result[inputs[it]-1])
        }
    }
}