import java.util.Scanner

fun main() {
    with(Scanner(System.`in`)) {
        val count = nextLine().toInt()
        val array = Array(count) {
            ""
        }
        repeat(count) {
            array[it] = nextLine().toString()
        }
        var baseString = array.first().toCharArray()
        for (i in array.indices) {
            for (j in 0 until array[i].length) {
                if (baseString[j] != array[i][j]) {
                    baseString[j] = '?'
                }
            }
        }
        println(String(baseString))
    }
}
