import java.util.Scanner

fun main() {
    with(Scanner(System.`in`)) {
        val count = nextLine().toInt()
        val result = mutableListOf<String>()
        repeat(count) {
            val (stringCount, string) = nextLine().split(" ")
            result.add(
                string.map {
                    it.toString().repeat(stringCount.toInt())
                }.joinToString(""),
            )
        }
        result.forEach {
            println(it)
        }
    }
}
