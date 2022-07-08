package warmke.mike.leet.p347

import java.util.Comparator

class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        return nums.groupBy { it }
            .toList()
            .sortedByDescending { it.second.size }
            .take(k)
            .map { it.first }
            .toIntArray()
    }
}