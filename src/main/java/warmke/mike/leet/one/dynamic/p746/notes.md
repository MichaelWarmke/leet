

# Min Cost Climbing Stairs

the idea here is to run DFS from 0 and from 1

once the leaf is reached take min of current and the cost of the leaf

the actual top is where i = cost.size

this is the brute force way -- was

DP solution O(n) Time and Memory
Brute Force O(2^n) Time O(n) Memory

    class Solution {
        lateinit var iCost: IntArray
    
        val memo = mutableListOf<List>()
    
        fun minCostClimbingStairs(cost: IntArray): Int {
            iCost = cost
    
            return min(recur(0), recur(1))
        }
    
        fun recur(i: Int): Int {
            if (i >= iCost.size) return 0
            if (memo[i] != null) return memo[i] 
    
            val costBelow = min(recur(i + 1), recur(i + 2))
    
            memo[i] = iCost[i] + costBelow
    
            return iCost[i] + costBelow
        }
    
    }