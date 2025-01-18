

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
            cur.isEnd = true
        }

        fun containsWord(word: String): Boolean {
            var cur = root 
            for (c in word) {
                if (cur[c] == null) break
                cur = cur[c]
            }
            return word[word.size - 1] == cur.c && cur.isEnd
        }
    }

### Java Impl

```java

import java.util.HashMap;

class Trie {
    @AllArgsConstructor
    static class Node {
        boolean isWord;
        String s;
        Map<String, node> children;
    }

    Node root = new Node(false, "", new HaspMap<>());

    public void insert(String word) {
        Node cur = root;
        for (int i = 0; i < word.size(); i++) {
            Char c = word.charAt(i);
            if (cur.children.get(c) == null) {
                Node newNode = new Node(c, new HashMap<>());
                cur.children.put(c, newNode);
                cur = newNode;
            } else {
                cur = cur.children.get(c);
            }
        }
        cur.setIsWord(true);
    }
    
    public boolean contains(String word) {
        Node cur = root; 
        for (char c : word.toCharArray()) {
            if (cur.children.get(c) == null) break;
            cur = cur.children.get(c);
        }
        
        return word.charAt(word.size() - 1) == cur.s && cur.isWord;
    }
}

```