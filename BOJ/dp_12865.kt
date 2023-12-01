fun main() {
    with(Scanner(System.`in`)) {
        val (count, totalWeight) = nextLine().split(" ").map {
            it.toInt()
        }
        val dp = Array(count + 1) {
            Array(totalWeight + 1) {
                0
            }
        }

        val list = mutableListOf<Pair<Int, Int>>()
        repeat(count) {
            val (weight, value) = nextLine().split(" ").map {
                it.toInt()
            }
            list.add(Pair(weight, value))
        }
        for (k in 1..count) {
            for (j in 1..totalWeight) { // j은 돌고있는 무게 , list.first는 현재 상품 무게
                val weight = list[k - 1].first
                val value = list[k - 1].second
                if (j >= list[k - 1].first) {
                    dp[k][j] = max(value + dp[k - 1][j - weight], dp[k - 1][j])
                } else {
                    dp[k][j] = dp[k - 1][j]
                }
            }
        }
        dp.sortBy {
            it.max()
        }

        println(dp.last().last())
    }
}
