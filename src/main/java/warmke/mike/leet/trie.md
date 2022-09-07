

# Trie or suffix Tree

    data class Node(val c: Char, var isEnd: Boolean = false) {
        val map = mutableMapOf<Char, Node>()
    }

    class Trie {
        
        val root: Node? = Node('')

        fun insert(word: String): Unit {
            var cur = root
            word.toCharArray().forEach {
                if (cur.map[it] != null) {
                    cur = cur.map[it]            
                } else {
                    val newNode = Node(it)
                    cur.map[it] = newNode
                    cur = newNode
                }
            }
            var.isEnd = true
        }

        fun containsWord(word: String): Boolean {
            var cur = root 
            for (c in word) {
                if (cur[c] == null) break
                cur = cur[c]
            }
            return cur[word.size - 1] == cur.c && cur.isEnd
        }

        
        
    }