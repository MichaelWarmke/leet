

# Partition Equal Subset Sum

    decision would be to send to par1 or par2

    class Solution {
        fun canPartition(nums: IntArray): Boolean {
            val total = nums.sum()
            if (total % 2 == 1) return false

            val set = mutableSetOf<Int>()
            set.add(0)
            val target = total / 2
            
            for (i in num.size - 1 downTo 0) {
                for( t in set.toSet()) {
                    set.add(t + nums[i])
                }
            }
            return set.contains(target)
        }
    }