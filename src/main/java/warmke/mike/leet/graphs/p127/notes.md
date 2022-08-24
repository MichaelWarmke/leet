

# Word Ladder

    al is n^2w  n = wordList.size m = wordList[0].length
    graph is w^n i would think
    

    class Solution {
        fun ladderLength(beginWord: String, endWord: String, wordList: List<String>): Int {
            if (!wordlist.contains(endWord)) return 0

            val al = wordList.asSequence().map { it to wordlist }
                    .mapValues { it.value.filter { word -> isSimilar(it.key, word)}}
            val visited = mutableSetOf<String>()        

            var min = Integer.MAX_VALUE   

            fun recur(word: String, i: Int) {
                if (word == endWord) {
                    min = min(min, i)
                    return
                }
                if (al[word] != null || visited[word] != null) return
                visited.add(word)

                al[word].forEach { recur(it, i + 1) }
                visited.remove(word)
            }   
            recur(beginWord,1)
            return if (min == Integer.MAX_VALUE) 0 else min
        }

        fun isSimilar(s1: String, s2: String): Boolean {
            var dif = 0
            for (i in 0 until max(s1.length, s2.length) - 1) {
                if (dif > 1) return false
                if (s1[i] != s2[i]) dif += 1
            }
            return true
        }
    }