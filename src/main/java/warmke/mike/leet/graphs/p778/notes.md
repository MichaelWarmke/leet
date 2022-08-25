

# Swim in Rising Water

    data class Node(val x: Int, val y: Int, val height: Int) : Comparable<Node> {

        override fun compareTo(other: Node): Int {
            return height.compareTo(other.height)
        }    
    }

    class Solution {
        fun swimInWater(grid: Array<IntArray>): Int {
            val visited = mutableSetOf<Node>()
            val minHeap = PriorityQueue<>(Comparators.reverseOrder())
            minHeap.add(Node(0, 0, grid[0][0]))
        
            var max = 0

            while (minHeap.isNotEmpty()) {
                val minNode = minHeap.remove()
                if (minNode.x == grid.size - 1 && minNode.y == grid.size - 1) return max

                visited.add(minNode)
                max = max(max, minNode.height)

                val x = minNode.x
                val y = minNode.y

                val neighbors = mutableListOf<Node>()
                if ( x - 1 > -1) 
                    neighbors.add(Node(x - 1, y, grid[x - 1][y]))
                if ( x + 1 < grid.size) 
                    neighbors.add(Node(x + 1, y, grid[x + 1][y]))
                if ( y - 1 > -1) 
                    neighbors.add(Node(x, y - 1, grid[x][y - 1]))
                if ( y + 1 < grid.size) 
                    neighbors.add(Node(x, y + 1, grid[x][y + 1]))
                

                neighbors.asSequence()
                    .filter { !visited.contains(it) }
                    .forEach { minHeap.add(it) }
            }

            return -1
        }
    } 