class Solution {
    fun solution(sequence: IntArray, k: Int): IntArray {
    // 1순위 짧은 수열
    // 2순위 앞에 있는 수열
    for (size in sequence.indices) {
        for (i in sequence.indices) {
            if (size + i > sequence.size - 1) {
                continue
            }
            if (sequence.slice(i..i + size).sum() == k) {
                    return intArrayOf(i, i + size)
                }
            //sequence의 index부터 size 만큼 끊어서 이 배열의 합이 k이면 return result로
            }
        }
    return intArrayOf()
    }
}
