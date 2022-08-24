package warmke.mike.leet

import java.lang.Math.pow
import java.util.*
import kotlin.collections.ArrayDeque
import kotlin.math.pow

class Solution {
    fun validate(n: Int, edges: Array<IntArray>): Boolean {
        val al = edges.asSequence().groupBy { it[0] }.mapValues { it.value.map { list -> list[1] } }
        val visited = mutableSetOf<Int>()

        fun recur(n: Int): Boolean {
            if (visited.contains(n)) return false
            var result = true
            for (i in al[n]!!) {
                result = result && recur(i)
            }
            return result
        }

        return recur(0) && visited.size == n
    }
}
