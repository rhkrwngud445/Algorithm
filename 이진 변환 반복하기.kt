class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = intArrayOf()
        var zeroCount = 0
        var count = 0
        var currentString = s
        while (currentString.length > 1) {

            zeroCount += currentString.count { it == '0' }
            if (currentString.none { it == '0' } && currentString.length == 1) {
                return intArrayOf(count, zeroCount)
            }
            currentString = currentString.filter { it == '1' }.length.toString(2)
            count++
        }
        return intArrayOf(count, zeroCount)
    }
}
