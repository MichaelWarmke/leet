

# Permutations

we are going to make a decision tree where we will call recur for each element in the input array

then we will pass in the rest of the nums as input to the recur

time complexity

n!

                          [ ]
          [1]             [2]             [3]
    [1,2]     [1,3] [2,1]     [2,3]  [3,1]    [3,2]
    [1,2,3] [1,3,2] [2,1,3] [2,3,1]  [3,1,2] [3,2,1]


    class Solution {
    
        val result = mutableListOf<List<Int>>()
    
        fun permute(nums: IntArray): List<List<Int>> {
            recur(listOf(), nums.toList())
    
            return result
        }
    
        fun recur(cur: List<Int>, nums: List<Int>) {
            if (nums.isEmpty()) {
                result.add(cur)
                return
            }
    
            for (i in nums.indices) {
                val newCur = cur.toMutableList()
                val newNums = nums.toMutableList()
                newCur.add(nums[i])
                newNums.remove(i)
                recur(newCur, newNums)
            }
        }
    }