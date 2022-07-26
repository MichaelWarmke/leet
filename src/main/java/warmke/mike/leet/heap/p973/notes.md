

# K Closest Points to Origin

use a max heap with k elements

how to construct the comparator?

why are we using the max heap over just calculating all the distances then sorting and taking 0..k points?
this solution would nlogn time due to the sorting of the array

the max Heap approach would be klogn time since we are only going to be popping from the heap k times
putting into the heap is O(n)

Overall would eb klogn
    
    class Point(val x: Int, val y: Int) : Comparable<Point> {
    
        override fun compareTo(other: Point): Int {
            return other.distanceToOrigin() - this.distanceToOrigin()
        }
    
        private fun distanceToOrigin(): Int {
            return x.toDouble().pow(2.0).toInt() + y.toDouble().pow(2.0).toInt()
        }
    }
    
    class Solution {
        fun kClosest(points: Array<IntArray>, k: Int): Array<IntArray> {
            val maxHeap = PriorityQueue<Point>()
            points.forEach {
                maxHeap.add(Point(it[0],it[1]))
            }
    
            while (maxHeap.size > k) {
                maxHeap.remove()
            }
    
            return maxHeap
                .map { intArrayOf(it.x, it.y) }
                .toTypedArray()
        }
    }