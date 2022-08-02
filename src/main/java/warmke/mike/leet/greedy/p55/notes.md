

# Jump Game

I think we could do a DFS here
were we jump the amount of step that are allowed

then if at any point we can not get any farther we return from recur function
and do step - 1 

this looks like it can be memoized
brute force (n^n)

    class Solution {
    
        lateinit var iNums: IntArray
    
        fun canJump(nums: IntArray): Boolean {
            iNums = nums
            return recur(0)
        }
    
        fun recur(i: Int): Boolean {
            if (i >= iNums.size -1) return true
            if (iNums[i] == 0) return false
    
            if (recur(i + iNums[i])) return true
    
            for (j in iNums[i] - 1..1) {
                if (recur(i + j)) return true
            }
    
            return false
        }
    }

---
dp O(n^2)

    class Solution {
    
        val dp = mutableListOf<Boolean>()
        lateinit var iNums: IntArray
    
        fun canJump(nums: IntArray): Boolean {
            iNums = nums
            return recur(0)
        }
    
        fun recur(i: Int): Boolean {
            if (i >= iNums.size -1) return true
            if (dp[1 != null]) return false
            if (iNums[i] == 0) {
                dp[i] = false
                return false
            }
    
            if (recur(i + iNums[i])) return true
    
            for (j in iNums[i] - 1..1) {
                if (recur(i + j)) return true
            }
    
            return false
        }
    }

---

Greedy O(n)

if we start at the end lets 
and iterate backwards to see if the next node can reach the one to the right


    class Solution {
        fun canJump(nums: IntArray): Boolean {
            var post = nums.size - 1            

            for (i in nums.size - 2..0) {
                if (nums[i] >= (post - i)) {
                    post = i
                }   
            }
            return post == 0
        }
    }
