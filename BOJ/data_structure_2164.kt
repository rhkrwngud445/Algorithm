import java.util.Scanner

fun main() {
    with(Scanner(System.`in`)) {
        val number = nextInt()
        val deque = ArrayDeque<Int>()
        repeat(number) {
            deque.addLast(it + 1)
        }

        repeat(number - 1) {
            deque.removeFirst()
            val first = deque.removeFirst()
            deque.addLast(first)
        }

        println(deque.last())
    }
}
