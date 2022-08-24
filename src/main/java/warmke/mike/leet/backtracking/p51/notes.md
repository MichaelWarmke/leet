    

# N Queens

    decision is to place queen on row

    class Solution {
        fun solveNQueens(n: Int): List<List<String>> {
            val result = mutableListOf<List<String>>
            val colsList = mutableListOf<Int>()
            val cols = mutableSetOf<Int>()
            val posD = mutableSetOf<Int>()
            val negD = mutableSetOf<Int>()

            fun recur(row: Int) {
                if (row >= n) {
                    result.add(formatBoard(colsList))
                    return
                }

                for (i in 0..n) {
                    if (cols[i] != null  || posD[i] != null || negD[i] != null) continue

                    cols.add(i)
                    colsList.add(i)
                    posD.add(row - i)
                    negD.add(row + i)

                    recur(row + 1)

                    cols.remove(i)
                    colsList.remove(i)
                    posD.remove(row - i)
                    negD.remove(row + i)
                }
            }
            
            recur(0)
            return result
        }

        fun formatBoard(cols: List<int>, n: Int()) { 
            var result = mutableListOf<List<String>>()
            
            while (i in 0..n -1) {
                val row = mutableListOf<String>()
                while(j in 0..n -1) {
                    val c = if (cols[i] == j) "Q" else "."
                    row.add(c)
                }
                result.add(row)
            }   
        }
    }