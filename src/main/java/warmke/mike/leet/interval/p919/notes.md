

# Meeting Room II


O(n^2) brute force for each interval scan through the rest of them and see how many overlap taking the max value of those


sort the list by start time then create a list<list<Interval>> or a list of rooms
we would loop through existing rooms to see if we could insert that meeting
and if we could not, we will create a new room
O(n * m) where m is the number of rooms needed, worst case O(n^2)

instead of keeping the rooms in a list, we could keep the rooms in a min heap sorted by end time
O(n logm) where m is the number of rooms, but overall O(nlogn) due to the sort

    class Interval(var start: Int = 0, var end: Int = 0): Comparable<Interval> {
        override fun compareTo(other: Interval): Int {
            return this.end - other.end
        }
    }

    class Solution {
        fun minMeetingRooms(intervals: List<Interval?>): Int {
            val sorted = intervals.filterNotNull().sortedBy { it.end }
            val minHeap = PriorityQueue<Interval>()

            sorted.forEach {
                if (minHeap.isEmpty() || minHeap.peek().end > it.start) {
                    minHeap.add(it)
                } else {
                    minHeap.remove()
                    minHeap.add(it)
                }
            }

            return minHeap.size
        }
    }

---

NEET

destructure into two separate sorted lists
two pointers one on each list
advance the one with lesser value

take the max of difference between the two pointers