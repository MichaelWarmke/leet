

# Non-overlapping Intervals

is the input array ordered? no

is 1,2 and 2,3 considered overlapping? no

we can have decision tree for the brute force solution, to include the interval or not

2^n

best algo for this is greedy

sort the array by start interval, then check everything with that start variable and remove the longest one

class Solution {

    fun eraseOverlapIntervals(intervals: Array<IntArray>): Int {
        val sorted = intervals.sortedBy { it[0] }
        var result = 0 

        if (sorted.isEmtpy()) return 0

        var prevEnd = interavls[0][1]
        for (i in 1..intervals.size - 1) {
            if (sorted[i][0] >= prevEnd) {
                prevEnd = sorted[i][1]
            } else {
                result += 1
                prevEnd = min(serted[i][0], prevEnd)
            }
        }

        return result
    }
}