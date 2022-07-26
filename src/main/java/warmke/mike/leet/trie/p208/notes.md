

# Implement Trie (Prefix Tree)

this is basically a tree where each node is the chars in a word


    class Trie() {
    
        class Node(val s: String) {
            var endOfWord: Boolean = false
            lateinit var nodes: MutableMap<String, Node>
        }
    
        var root: Node = Node("")
    
        fun insert(word: String) {
            var cur = root
            for (c in word.split("")) {
                val mapForChar = cur.nodes[c]
                cur = if (mapForChar != null) {
                    mapForChar
                } else {
                    val newNode = Node(c)
                    cur.nodes[c] = newNode
                    newNode
                }
            }
            cur.endOfWord = true
        }
    
        fun search(word: String): Boolean {
            var cur = root
            for (c in word.split("")) {
                val mapForChar = cur.nodes[c] ?: return false
                cur = mapForChar
            }
            return cur.endOfWord
        }
    
        fun startsWith(prefix: String): Boolean {
            var cur = root
            for (c in prefix.split("")) {
                val mapForChar = cur.nodes[c] ?: return false
                cur = mapForChar
            }
            return true
        }
    
    }

---

* Your Trie object will be instantiated and called as such:
* var obj = Trie()
* obj.insert(word)
* var param_2 = obj.search(word)
* var param_3 = obj.startsWith(prefix)
/