

# Word Search
    
    time O(n*m)
    space O(n*m)

    class Solution {
        fun exist(board: Array<CharArray>, word: String): Boolean {
            
            board.forEachIndexed { i -> 
                i.forEachIndexed { j ->
                    if (dfs(board, i, j, word)) return true 
                }
            }
            return false
        }

        fun dfs(board: Array<CharArray>, i: Int, j:Int, word: String): Boolean {
            val visited: Array<IntArray> = arrayOf(intArrayOf())            

            fun recur(ir: Int, jr: Int, charIndex: Int): Boolean {
                if (ir < 0 || ir >= board.size
                    jr < 0 || jr >= board[0].size
                    || visited[ir][jr] == 1
                    || board[ir][jr] != word[charIndex]) return false
                
                if (charIndex == word.size - 1) return true

                return recur(ir + 1, jr, char + 1) ||
                        recur(ir - 1, jr, char + 1) ||
                        recur(ir, jr + 1, char + 1) ||
                        recur(ir, jr - 1, char + 1)
            }
            return recur(i,j,0)
        }
    }