package warmke.mike.leet

import java.lang.Math.*
import java.util.*
import kotlin.math.pow

class Solution {

    fun maxSubArray(nums: IntArray): Int {
        var r = 0
        var maxSum = 0 // Int.MIN
        var curSum = 0 // Int.MIN

        while (r < nums.size) {
            curSum += nums[r]
            r += 1

            if (curSum < 0) {
                curSum = 0 // Int.MIN
            }

            maxSum = kotlin.math.max(maxSum, curSum)
        }

        return maxSum
    }
}