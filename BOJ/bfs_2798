import kotlin.math.abs
fun main() {
    val (count, max) = readln().split(" ")
    val numbers = readln().split(" ").sorted().map { it.toInt() }
    val sumArray = mutableListOf<Int>()
    for (i in 0 until numbers.size - 2) {
        for (j in i + 1 until numbers.size - 1) {
            for (z in j + 1 until numbers.size) {
                sumArray.add(numbers[i] + numbers[j] + numbers[z])
            }
        }
    }

    val result = sumArray.filter { it <= max.toInt() }.minWithOrNull(compareBy { abs(it - max.toInt()) })
    println(result)
}
