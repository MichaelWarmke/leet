

# Design Add and Search Words Data Structure

we are going to use a trie for this, when we get to the '.' char we will search everyone one of the sub-nodes

    class WordDictionary() {
    
        class Node(val s: Char ) {
            var endOfWord: Boolean = false
            lateinit var nodes: MutableMap<Char, Node>
        }
    
        val root = Node('')
    
        fun addWord(word: String) {
            var cur = root
            word.forEach {
                val mapForChar = cur.nodes[it]
                cur = if (mapForChar != null) {
                    mapForChar
                } else {
                    var newNode = Node(it)
                    cur.nodes[it] = newNode
                    newNode
                }
            }
            cur.endOfWord = true
        }
    
        fun search(word: String): Boolean {
            return search(word, root)
        }
    
        fun search(word: String, node: Node): Boolean {
            if (word.length == 1) return (word[0] == node.s || word[0] == '.') && node.endOfWord
    
            if (word[0] == '.') return node.nodes.values.any { search(word.substring(1), it) }
    
            val nodeForChar = node.nodes[word[0]]
            if (nodeForChar != null) return search(word.substring(1), nodeForChar)
            
            return false
        }
    
    }

---

/**
* Your WordDictionary object will be instantiated and called as such:
* var obj = WordDictionary()
* obj.addWord(word)
* var param_2 = obj.search(word)
  */