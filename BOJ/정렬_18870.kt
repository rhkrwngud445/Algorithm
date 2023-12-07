import java.util.Scanner

fun main() {
    with(Scanner(System.`in`)) {
        val count = nextLine().toInt()
        val values: MutableList<Pair<Int, Int>> = nextLine().split(" ").mapIndexed { index, s ->
            Pair(index, s.toInt())
        }.toMutableList()
        val result = Array(count) {
            0
        }
        values.sortBy {
            it.second
        }

        var min = values.first().second
        var count1 = 0
        values.forEachIndexed { index, pair ->
            if (min == pair.second) {
                result[pair.first] = count1
            } else if (min < pair.second) {
                min = pair.second
                count1++
                result[pair.first] = count1
            }
        }
        println(result.joinToString(" "))
    }
}
