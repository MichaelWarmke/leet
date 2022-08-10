

# Insert Interval

Binary Search to find the first interval that contains the new interval


    class Solution {
        fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {

            var r = 0
            var l = intervals.size - 1
            var midp = 0
    
            while (r > l) {
                if (newInterval[0] > intervals[midp][1] && newInterval[1] > intervals[midp][1]) {
                    l = midp + 1
                    midp = (r - l) / 2
                }
    
                if (newInterval[0] < intervals[midp][0] && newInterval[1] < intervals[midp][0]) {
                    r = midp - 1
                    midp = (r - l) / 2
                }
    
                if (newInterval[0] > intervals[midp][0] && newInterval[0] < intervals[midp][1] ||
                    newInterval[1] > intervals[midp][0] && newInterval[1] < intervals[midp][1]) {
                    break;
                }
            }
    
            while (newInterval[0] > intervals[l][0]) {
                l += 1
            }
    
            while (newInterval[1] < intervals[r][1]) {
                r += 1
            }
    
    
            val newL = min(newInterval[0], intervals[l][0])
            val newR = max(newInterval[1], intervals[r][1])
    
            val result = intervals.toMutableList()

            while (l < r && r != 0 && r != intervals.size - 1) {
                result.removeAt(l)
                l += 1
            }
    
            result.insertAt(r, intArrayOf(newL, newR))
            return result.toTypedArray()
        }
    }

---

neet
does not use the binary search part, and constructs a new list instead of modifying in place

    class Solution {
        fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
            val result = mutableListOf<Int>()
            var insertInterval = newInterval.toList()
            var r = 0
            var l = 0

            intervals.forEachIndexed { i, v ->
                if (newInterval[1] < v[0]) {
                    result.add(newIntervals)
                    result.addAll(intervals)
                    return result.toTypedArray()
                } else if ( newInterval[0] ? v[1])
                    result.add(v)
                } else {
                    insertInterval = listOf(min(insertInterval[0], v[0]), max(insertInterval[1], v[1]))
                }
            }

            result.add(insertInterval)

            return result
        }
    }
