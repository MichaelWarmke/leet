

# Subsets

do a DFS here over a Decision Tree
where is the decision is to add the number or not

O(n2^n)

             []
        [1]     []
    [1,2] [1] [2] []

    class Solution {
        val result = mutableListOf<Set<Int>>()
        lateinit var inums: IntArray
    
        fun subsets(nums: IntArray): List<List<Int>> {
            inums = nums
            recur(0, setOf())
            return result.map { it.toList() }
        }
    
        fun recur(i: Int, curSet: Set<Int>) {
            if (i >= inums.size) {
                result.add(curSet)
                return
            }
    
            recur(i + 1, curSet)
    
            val newSet = curSet.toMutableSet()
            newSet.add(inums[i])
            recur(i + 1, newSet)
        }
    
    }