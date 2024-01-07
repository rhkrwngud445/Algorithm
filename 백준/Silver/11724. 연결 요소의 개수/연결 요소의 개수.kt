import java.util.LinkedList
import java.util.Scanner

fun main() {
    with(Scanner(System.`in`)) {
        val (node, edge) = nextLine().split(" ").map {
            it.toInt()
        }
        val graphList = mutableListOf<MutableList<Int>>()
        val hashMap = HashMap<Int, List<Int>>()

        val notUsed = Array(node) {
            true
        }

        repeat(edge) {
            val (first, second) = nextLine().split(" ").map {
                it.toInt()
            }
            notUsed.forEachIndexed { index, b ->
                if (index + 1 == first || index + 1 == second) {
                    notUsed[index] = false
                }
            }
            hashMap[first]?.let {
                hashMap.put(first, it + second)
            } ?: hashMap.put(first, listOf(second))
        }

        hashMap.forEach { (i, ints) ->
            for (j in 0 until graphList.size) {
                if (graphList[j].intersect((ints + i).toSet()).isNotEmpty()) {
                    graphList[j] = (graphList[j] + i + ints).toSet().toMutableList()
                    return@forEach
                }
            }
            graphList.add((ints + i).toMutableList())
        }

        print(graphList.size + notUsed.count { it == true })
    }
}