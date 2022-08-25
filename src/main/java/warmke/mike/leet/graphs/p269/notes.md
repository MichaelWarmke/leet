

# Alien Dictionary

    topological sort
    graph with directed edges but no cycles

    build al
    post order traversal to get the answer

    class Solution {

        fun something(words: List<String>): String {
            val al = words.asSequence().map { it.toCharArray().toList() }.flatten().map { it to mutableListOf<Char>() }.toMap()
            val result = mutableListOf<String>()
    
            for (i in words.indices) {
                val w1 = words[i]
                val w2 = words[i + 1]
                val minLen = min(w1.length, w2.length)
    
                if (w1.length > w2.length && w1.substring(0, minLen) == w2.substring(0, minLen))
                    return ""
    
                for (j in 0..minLen) {
                    if (w1[j] != w2[j]) {
                        al[w1[j]]!!.add(w2[j])
                        break
                    }
                }
            }
            val visited = mutableMapOf<Char, Boolean>()
    
    
            fun recur(c: Char): Boolean {
                if (al[c] != null) return visited[c] != null
    
                visited[c] = true
    
                for (nei in al[c]!!) {
                    if (recur(nei)) return true
                }
    
                visited[c] = false
                result.add(c.toString())
                return true
            }
    
            for (c in al.keys) {
                if (recur(c)) return ""
            }
    
            return result.reversed().joinToString()
        }
    }