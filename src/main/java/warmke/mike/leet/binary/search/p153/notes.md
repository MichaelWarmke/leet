

# Find Min in rotated sorted array

    class Solution {
        fun findMin(nums: IntArray): Int {
            var l = 0
            var r = nums.size - 1
            var result = 0

            while (l <= r) {
                if (nums[l] > nums[r]) { 
                    result = min(result, nums[l])
                    break
                }

                val mp = (l + r) / 2
                result = min(result, nums[mp])
                if (nums[l] < nums[mp]) {
                    l = mp + 1
                } else {
                    r = mp - 1
                }
            }
            return result
        }
    }

    1 2 3 4 5 6

    4 5 6 1 2 3

    6 1 2 3 4 5