

# Redundant Connection

    wierd algo
    union find by rank

    class Solution {
        fun findRedundantConnection(edges: Array<IntArray>): IntArray {
            val parent = (1..edges.size).toMutableList()
            val rank = MutableList(edges.size) { it }

            fun find(n: Int): Int {
                var p = parent[n]
                while p != parent[p] {
                    parent[p] = parent[parent[p]]
                    p = parent[p]
                }
                return p 
            } 

            fun union(n1: Int, n2: Int): Boolean {
                val p1 = find(n1)
                val p2 = find(n2)

                if (p1 == p2) return false
    
                if (rank[p1] > rank[p2]) {
                    parent[p2] = p1
                    rank[p1] += rank[p2]
                } else {
                    parent[p1] = p2
                    rank[p2] += rank[p1]
                }

                return true
            } 

            for (i in edges.indeces) {
                if (!union(edges[i][0], edges[i][1])) return edges[i] 
            }
        }
    }