

# Find the Duplicate Number

    O(n) time constant space

    class Solution {
        fun findDuplicate(nums: IntArray): Int {
            var slow = 0
            var fast = 0
    
            slow = nums[slow]
            fast = nums[nums[fast]]

            while (slow != fast) {
                slow = nums[slow]
                fast = nums[nums[fast]]
            } 

            slow2 = 0
            while (slow != slow2) {
                slow = nums[slow]
                slow2 = nums[slow2]
            }
            return slow 
        }
    }