

# Maximum Subarray

brute force would be to compute the values for all sub arrays

was think to use a sliding window

always update the right pointer
update the left pointer to be equal to right if the value in the window goes negative

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