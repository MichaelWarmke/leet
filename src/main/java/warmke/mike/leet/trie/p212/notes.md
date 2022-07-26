

# Word Search II

the plan is to insert all the search words into a trie

then loop through the grid

then for each position in the grid we need to perform a DFS

    class Trie {

        class Node(val c: Char) {
            var isEndOfWord: Boolean = false
            lateinit var children: MutableMap<Char, Node>
        }
    
        val root = Node('!')
    
        fun insert(s: String ) {
            var cur = root
            s.forEach {
                val mapForChar = cur.children[it]
                cur = if (mapForChar != null) {
                    mapForChar
                } else {
                    val newNode = Node(it)
                    cur.children[it] = newNode
                    newNode
                }
            }
            cur.isEndOfWord = true
        }
    }

    class Solution {
        private val trie = Trie()
        private val foundWords: MutableSet<String> = mutableSetOf()
        private val visited = mutableSetOf<String>()
        private var rows: Int = 0
        private var cols: Int = 0
        private lateinit var iBoard: Array<CharArray>
    
        fun findWords(board: Array<CharArray>, words: Array<String>): List<String> {
            iBoard = board
            words.forEach { trie.insert(it) }
            rows = board.size
            cols = board[0].size
    
            for (r in board.indices) {
                for (c in board.indices) {
                    dfs(r,c,trie.root, "")
                }
            }
    
            return foundWords.toList()
        }
    
        private fun dfs(r: Int, c: Int, node: Trie.Node?, word: String) {
            if (r < 0 || c < 0 || r == rows || c == cols
                || visited.contains(r.toString() + c.toString()) || node?.children?.contains(iBoard[r][c]) == true)
                return
    
            visited.add(r.toString() + c.toString())
    
            var newNode = node?.children?.get(iBoard[r][c])
            val newWord = word + (newNode?.c ?: "")
    
            if (node?.isEndOfWord == true) foundWords.add(newWord)
    
            dfs(r - 1,c, newNode, newWord)
            dfs(r + 1,c, newNode, newWord)
            dfs(r,c - 1, newNode, newWord)
            dfs(r,c + 1, newNode, newWord)
            visited.remove(r.toString() + c.toString())
        }
    }


this took over an hour even with help, hopefully nothing like this gets asked