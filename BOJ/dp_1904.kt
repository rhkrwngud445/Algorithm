import java.util.Scanner

fun main() {
    with(Scanner(System.`in`)) {
        val number = nextLine().toInt()
        val array = Array(10000001) {
            1
        }
        array[0] = 1
        array[1] = 2
        for (i in 2 until number) {
            array[i] = (array[i - 1] + array[i - 2]) % 15746
        }
        print(array[number - 1])
    }
}
