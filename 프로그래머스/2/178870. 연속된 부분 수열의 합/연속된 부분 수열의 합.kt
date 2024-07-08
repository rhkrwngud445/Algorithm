class Solution {
    fun solution(sequence: IntArray, k: Int): IntArray {
        var l = 0
        var r = 0
        var sum = sequence[l]
        val temporary = mutableListOf<IntArray>()
        while (l < sequence.size) {
            if (sum < k) {
                if (r == sequence.size - 1) break
                sum += sequence[++r]
            } else {
                if (sum == k) {
                    temporary.add(intArrayOf(l, r))
                }
                sum -= sequence[l++]
            }
        }
        val minSize = temporary.minOf { it[1] - it[0] }
        return temporary.first { it[1] - it[0] == minSize }
    }
}
