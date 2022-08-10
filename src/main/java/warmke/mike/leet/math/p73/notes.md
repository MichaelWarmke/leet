

# set matrix zeros

find all zeros of array O(n*m)
and replace those values O(n*m)

space would be O(n + m)

    class Solution {
        fun setZeros(matrix: Array<IntArray>): Unit {
            val rows = mutableSetOf<Int>()
            val cols = mutableSetOf<Int>()
    
            for (i in matrix.indices) {
                for (j in matrix[0].indices) {
                    if (matrix[i][j] == 0) {
                        rows.add(i)
                        cols.add(j)
                    }
                }
            }
    
            for (i in matrix.indices) {
                for (j in matrix[0].indices) {
                    if (rows.contains(i) || cols.contains(j)) {
                        matrix[i][j] = 0
                    }
                }
            }
        }
    }

---

for a constant space solution
we would mark each cell in place that needs to have zeros
then iterate through all of those cells and fill the zeros