

# Adjacency List

### construct an adjacency list

    this is a map of current node/vertex to a list of the next prossible node

    where edge are like [[0,1],[2,6]]
    fun al(edges: Array<IntArray>) {
        val al = times.groupby { it[0] }.mapValues { it.map { list -> list[1] } }
    }