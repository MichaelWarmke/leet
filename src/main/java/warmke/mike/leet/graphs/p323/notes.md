

# Number of Connected Components in an Undirected Graph

    class Solution {
        fun countComponents(n: Int, edges: Array<IntArray>): Int {
            val parent = (1..n).toMutableList()
            val rank = MutableList(n) { it }


            fun find(n: Int) {
                var result = parent[n]

                while(result != parent[result]) {
                    result = parent[result]
                }
                return result
            }

            fun union(n1: Int, n2: Int): Unit {
                val p1 = find(n1)
                val p2 = find(n2)

                if rank[p1] > rank[p2] {
                    parent[p2] = p1
                    rank[p1] += rank[p2]
                } else {
                    parent[p1] = p2
                    rank[p2] += rank[p1]
                }
            }

            for (i in edges.indeces) {
                union(edges[i][0], edges[i][1])
            }

            return parent.toSet().size
        }
    }