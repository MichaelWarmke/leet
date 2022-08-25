

# Min Cost to Connect All Points

    data class Point(val index: Int, val distance: Int) : Comparable<Point> {

        fun ditanceTo(other: Point): Int {
            return abs(x - other.x) + abs(y - other.y)
        }

        override fun compareTo(other: Point): Int {
            return distance.compareTo(distance)
        }
    }

    class Solution {
        fun minCostConnectPoints(points: Array<IntArray>): Int {
            val visited = mutableSet<Int>()
            minHeap = PriorityQueue<Point>(Comparators.reverseOrder())
            val cpoints = points.mapWithIndex { i, v -> Point(i, 0)}
            val result = 0

            while (visited.size != points.size) {
                minHeap.clear()
                val point = cpoint.findFirst { !visited.contains(it.index) }
                cpoints.asSequence()
                    .filter { it != point && !vistied.contains(it) }
                    .map { Point(it.index, point.distanceTo(it)) }
                    forEach { minHeap.add(it) }

                val connectedPoint = minHeap.peek()
                result += connectedPoint.distance
                visited.add(connectedPoint.index)
            }
            
            return result
        }
    }