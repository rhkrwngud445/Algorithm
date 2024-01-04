fun main() {
    print(readln().split(" ").map { it.toInt() }.reduce { acc, i -> acc - i })
}