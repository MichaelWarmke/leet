

# Missing Number

    we can reuse the find single solution


    class Solution {
        fun missingNumber(nums: IntArray): Int {
            var res = 0

            for (i in 0..nums.size - 1) {
                res = res xor nums[i]
                res = res xor i
            }

            res = res xor nums.size
            return res
        }
    }