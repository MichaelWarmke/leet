

# Search in Rotated Sorted Array

    class Solution {

        fun search(nums: IntAray, target: Int): Int {
            var r = 0
            var l = nums.size -1
            

            while (l <= r) {
                var mp = (r + l) / 2
                if (target == nums[mp]) return mid

                if (nums[l] <= nums[mp]) {
                    if (target > nums[mp] && target < nums[l]) {
                        l = mp + 1
                    } else {
                        
                    } 
                } else {
                    if (target < nums[mp] && target > nums[r]) {
                        r = mp - 1
                    } else {
                        l = mp + 1
                    }
                }
            }

            return -1
        }
    }