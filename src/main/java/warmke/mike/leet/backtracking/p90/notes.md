

# Subsets II

would the solution here be any different from p78?
i dont think so

yes it is

for example [1,2,2] would have [2] and [2] happen twice here

you cant just solve this by converting everything into a set

solution is to only go down the left side of the tree if that value is not already in t

time complexity

O(n2^n)

constructing the tree 2^n
 n because we need to generate that many subsets

    class Solution {
    
        val result = mutableListOf<List<Int>>()
        lateinit var iNums: List<Int>
    
        fun subsetsWithDup(nums: IntArray): List<List<Int>> {
            iNums = nums.sort().toList()
    
            recur(0, setOf())
    
            return result
        }
    
        fun recur(i: Int, cur: Set<Int>) {
            if (i >= iNums.size) {
                result.add(cur.toList())
                return
            }

            val newCur = cur.toMutableSet()
            newCur.add(iNums[i])
        
            recur(i + 1, newCur)

            while (i + 1 < iNums.size && iNums[i] == iNums[i + 1]) 
                i += 1
            }
            recur(i + 1, cur)
        }
    }