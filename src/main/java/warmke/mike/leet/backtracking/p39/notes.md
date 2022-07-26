

# Combination Sum

do a DFS of a decision tree that either adds the first value in the input array to the set or removes it \
from the list of chars to be put in the set

return if the sums of the values goes over the target

time complexity

since we are making two decision at a time, and 

2 ^ target



    class Solution {
    
        val result = mutableListOf<List<Int>>()
        lateinit var iCandidates: List<Int>
        var iTarget = 0
    
        fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
            iTarget = target
            iCandidates = candidates.toList()
    
            recur(listOf(), 0)
    
            return result
        }
    
        fun recur(curList: List<Int>, i: Int) {
            if (i > iCandidates.size - 1) return
            if (curList.sum() > iTarget) return
            if (curList.sum() == iTarget) {
                result.add(curList)
                return
            }
    
            val newList = curList.toMutableList()
            newList.add(iCandidates[i])
    
            recur(newList, i)
            recur(curList, i + 1)
        }
    }