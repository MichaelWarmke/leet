

# Valid Graph Tree

    you can use union find or DFS to determine this

    class Solution {
        fun validate(n: Int, edges: Array<IntArray>): Boolean {
            val parent = (1..n).toMutableList()
            val rank = MutableList(n) { it }

            fun find(n: Int): Int {
                var p = parent[n]
                while p != parent[p] {
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
                    rank[p2] += rank[p1]
                } else {
                    parent[p1] = p2
                    rank[p1] += rank[p2]
                }
                return true
            }

            while (i in edges.indeces) {
                if (!union(edges[i][0], edges[i][1])) return false
            }
            return parent.toSet().size == 1
        }
    }

---

    DFS    

    class Solution {
        fun validate(n: Int, edges: Array<IntArray>): Boolean {
            val al = edges.asSequence().groupBy { it[0] }.mapValues { it.value.map { list -> list[1] } }
            val visited = mutableSetOf<Int>()

            fun recur(i: Int, prev: Int): Boolean {
                if (i == null) return true
                if (visited.contains(i)) return false
                visited.add(i)

                for (j in al[n]!!) {
                    if (j == prev) continue
                    if (!recur(al[j], j)) return false
                }
                return true
            }
            
            return recur(0, -1) && visited.size == n
        }
    }