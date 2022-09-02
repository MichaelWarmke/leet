

# Maximum Product Subarray

    im not sure what this solution has to do with dynamic programming

    O(n) Time
    O(1) Space

    class Solution {
        fun maxProduct(nums: IntArray): Int {
            var res = nums.maxOf { it }
            var curMin = 1
            var curMax = 1
    
            for (n in nums) {
                if (n == 0) {
                    curMin = 1
                    curMax = 1
                    continue
                }
    
                val tempMax = curMax * n
                curMax = max(tempMax, max(n * curMin, n))
                curMin = min(tempMax, min(n * curMin, n))
                res = max(res, curMax)
            }
            return res
        }
    }