import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class PSKotlin {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val token = StringTokenizer(br.readLine())
            val size = Integer.parseInt(token.nextToken())
            val weightSum = Integer.parseInt(token.nextToken())
            var weight = arrayOfNulls<Int>(size)
            var value = arrayOfNulls<Int>(size)
            for(i in 0..size-1){
                val brArray = BufferedReader(InputStreamReader(System.`in`))
                val tokenArray = StringTokenizer(brArray.readLine())
                weight[i] = Integer.parseInt(tokenArray.nextToken())
                value[i] = Integer.parseInt(tokenArray.nextToken())
//                println("${value.get(i)} and ${weight.get(i)} ")
            }
            val minWeight = getWeightMin(weight)
            while(weightSum>=minWeight){

            }
            br.close()
        }

        fun getWeightMin(array: Array<Int?>) : Int{
            var min = array[0]
            for (i in 0..array.size-1) {
                if (min != null) {
                    if (min > array.get(i)!!) {
                        min = array.get(i)
                    }
                }
            }
            return min!!
        }
    }
}