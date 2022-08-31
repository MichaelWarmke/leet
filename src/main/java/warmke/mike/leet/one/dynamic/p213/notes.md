

# House Robber II

    1 2 3 1

    1 2 4 

    for odd rob1 = n rob2 = n - 1
        even rob1 n -1 rob2 n

    class Solution {
        fun rob(nums: IntArray: Int {
            fun robsub(ns: IntArray): Int {
                var rob1 = 0
                var rob2 = 0
    
                for (i in nums.indeces) {
                    temp = max(nums[i] + rob1, rob2)
                    rob1 = rob2
                    rob2 = temp
                }
                return rob2
            }

            return max(robsub(nums.subarray(0, nums.size - 1)), sobsub(nums.subarray(1, nums.size)))
        }
    }