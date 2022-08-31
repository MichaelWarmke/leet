package warmke.mike.leet

import java.lang.Math.*
import java.util.*
import kotlin.collections.ArrayDeque
import kotlin.math.pow

class Solution {
    fun rob(nums: IntArray): Int {
        fun robsub(ns: IntArray): Int {
            var rob1 = 0
            var rob2 = 0

            for (i in nums) {
                val temp = max(nums[i] + rob1, rob2)
                rob1 = rob2
                rob2 = temp
            }
            return rob2
        }

        'c'.digitToInt()

        return max(robsub(nums.copyOfRange(0, nums.size - 1)), robsub(nums.copyOfRange(1, nums.size)))
    }
}