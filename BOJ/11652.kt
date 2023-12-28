import java.util.LinkedList
import java.util.Scanner

fun main() {
    with(Scanner(System.`in`)) {
        val count = nextInt()
        val array = Array(count) {
            0L
        }
        repeat(count) {
            array[it] = nextLong()
        }

        val hashmap = hashMapOf<Long, Int>()

        array.forEach {
            hashmap[it] = hashmap.getOrDefault(it, 0) + 1
        }

        println(hashmap.toSortedMap().maxBy {
            it.value
        }.key)
    }
}
