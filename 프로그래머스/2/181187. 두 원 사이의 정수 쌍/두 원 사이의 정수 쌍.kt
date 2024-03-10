import kotlin.math.*

class Solution {
    fun solution(r1: Int, r2: Int): Long {    
        var answer = 0L
        val powR1 = r1.toDouble().pow(2)
        val powR2 = r2.toDouble().pow(2)
        for(i in 1..r2) {
            val max: Long = floor(Math.sqrt(powR2-i.toDouble().pow(2))).toLong()
            val min: Long = ceil(Math.sqrt(powR1-i.toDouble().pow(2))).toLong()
            answer+= (max-min +1)
        }
        return answer*4
    }
}

fun findDot(radius: Int): Long {
    var count = 0L
    for(i in 0..radius) {
            for(j in 0..radius) {
                if(Math.sqrt(i.toDouble().pow(2)+j.toDouble().pow(2))<=radius) {
                    count++
                }
            }
        }

    return count
}