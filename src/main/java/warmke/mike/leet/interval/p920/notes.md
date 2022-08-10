

# Meeting Rooms



    class Interval {
       var start: Int = 0
       var end: Int = 0
       constructor(start: Int, end: Int) {
           this.start = start
           this.end = end
       }
    }
      

    class Solution {
    
        fun canAttendMeetings(intervals: List<Interval?>): Boolean {
            val sorted = intervals.sortedBy { it.start }

            var prevEnd = sorted[0].end
            for (i in 1..sorted.size - 1) {
                if (sorted[i].start < prevEnd) {
                    return false
                }
                prevEnd = sorted[i].end
            }
        }
        
        return true
    }