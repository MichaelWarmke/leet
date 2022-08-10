

# Merge Intervals

O(nlogn) time O (n) space

    class Solution {
    
        fun merge(intervals: Array<IntArray>): Array<IntArray> {
    
            val result = mutableListOf<IntArray>()
            val sorted = intervals.sortedBy { it[0] }
    
            var curInterval = intArrayOf()
    
            sorted.forEach {
    
                if (curInterval.isEmpty()) {
                    curInterval = it
                }
    
                if (curInterval[1] >= it[0]) {
                    curInterval = intArrayOf(curInterval[0], max(it[1], curInterval[1]))
                } else {
                    result.add(curInterval)
                    curInterval = it
                }
            }
    
            result.add(curInterval)
            return result.toTypedArray()
        }
    }