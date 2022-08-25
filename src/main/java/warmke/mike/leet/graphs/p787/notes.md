

# Cheapest Flights Within K Stops
    djiksra's algo but also with a extra condition od being at most k stops

    data class Flight(val des: Int, val cost: Int, val stop: Int = 0, val stopMax: Int) : Comparable<Flight> {

        override fun compareTo(other: Flight): Int {
            return if (stop > stopMax) 1 else cost.compareTo(other.cost)
        }
    }

    class Solution {
        fun findCheapestPrice(n: Int, flights: Array<IntArray>, src: Int, dst: Int, k: Int): Int {
            val al = (0..n).map { it to mutableListOf<Flight>()}.toMap()
            flights.forEach { al[it[0]]!!.add(Flight(it[1], it[2], 0, k)) }

            val minHeap = PriorityQueue<Flight>()
            minHeap.add(Flight(src, 0, 0, k))

            val visited = mutableSetOf<Int>()

            while (minHeap.isNotEmpty()) {
                val cur = minHeap.remove()
                if (cur.des == dst) return cur.cost
                if (visited.contains(cur.des)) continue
                if (cur.stop > k) return break

                visited.add(cur.des)

                al[cur.des]!!.asSequence()
                    .map { Flight(it.des, cur.cost + it.cost, it.stop + 1, it.stopMax) }
                    .forEach { minHeap.add(it) }

            }
            return -1
        } 
    }

--- 

neet uses bellman-ford

    class Solution {

        fun fundCheapestPrice(n: Int, flights: Array<IntArray>, src: Int, dst: Int, k: Int: Int {
            val prices = mutableList(n) { Int.MAX_VALUE }
            prices[src] = 0

            for (i in 0..k+1) {
                tmpPrices = prices.toMutableList()

                for (j in flights.indeces) {
                    if (prices[flights[j][0]] == Int.MAX_VALUE) continue

                    if (prices[flights[j][0]] + flights[j][2] < tmpPrices[flights[j][1]]) {
                        tmpPrices[flights[j][1]] = prices[flights[j][0]] + flights[j][2]
                    }
                }
                prices = tmpPrices
            }

            return if(prices[dst] == Int.MAX_VALUE) -1 else prices[dst]
        }
    }

