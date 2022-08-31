

# House Robber

    class Solution {
        fun rob(nums: IntArray): Int {
            val map = mutableMapOf<Int, Int>()

            fun recur(i: Int): Int {
                if (i >= nums.size) return 0
                if (map[i] != null) return map[i]
        
                val max = max(recur(i + 2), recur(i + 3))
                
                map[i] = max
                return max + numes[i]
            }

            return max(recur(0), recur(1))
        }
    }

---

neet

    class Solution {
        fun rob(nums: IntArray: Int {
            var rob1 = 0
            var rob2 = 0

            for (i in nums.indeces) {
                temp = max(nums[i] + rob1, rob2)
                rob1 = rob2
                rob2 = temp
            }
            return rob2
        }
    }