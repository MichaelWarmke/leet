

# Network Delay Time

    Djikstra

    data class Point(val n: Int, val time: Int) : Comparable<Point> {

        override fun compareTo(other: Point): Int {
            return time.compareTo(other.time)
        }
    }

    class Solution {
        fun networkDelayTime(times: Array<IntArray>, n: Int, k: Int): Int {
            val al = times.groupby { it[0] }.mapValues { it.map { list -> to Point(list[1], list[2]) } }
            val visited = mutableSetOf<Int>()

            var min = Integer.MAX_VALUE
            var curTotal = 0

            val minHeap = PriorityQueue<Point>(Comparators.reverseOrder())
            minHeap.add(0, k)

            while(minHeap.isNotEmpty()) {
                val minPoint = minHeap.remove()
                if (visited[i] != null) continue

                visited.add(i)
                curTotal = max(curTotal, minPoint.time)

                al[minPoint].asSequence()
                    .map { Point(it.n, it.time + minPoint.time) }
                    .forEach { minHeap.add(it) }
                
            }
            return if (visited.size == n) curTotal else -1
        }
    }