

# Word Break

---

### Brute force

    O (mn^2) Time
    O ()

    class Solution {
        fun wordBreak(s: String, wordDict: List<String>): Boolean {
    
            fun recur(i: Int): Boolean {
                if (i >= s.length) return true
    
                return wordDict.any {
                    if (it.length > s.length - i) return false
    
                    if (s.substring(i, i + it.length - 1) == it) {
                        return recur(i + it.length)
                    }
                    return false
                }
            }
    
            return recur(0)
        }
    }

---

### Memo Top Down

    O (mn^2) Time

    class Solution {
        fun wordBreak(s: String, wordDict: List<String>): Boolean {
            val memo = mutableMapOf<Int, Boolean>()

            fun recur(i: Int): Boolean {
                if (memo[i] != null) return memo[i]
                if (i >= s.length) return true
    
                val sub wordDict.any {
                    if (it.length > s.length - i) return false
    
                    if (s.substring(i, i + it.length - 1) == it) {
                        return recur(i + it.length)
                    }
                    return false
                }
                memo[i] = sub
                return sub
            }
    
            return recur(0)
        }
    }

---

### Tab bottom up

    class Solution {
        fun wordBreak(s: String, wordDict: List<String>): Boolean {
            val tab = (0..s.length + 1).asSequence().map { false }.toMutableList()
            tab[s.length + 1] = true

            for (i in s.length downTo 0) {
                for (w in wordDict) {
                    if (s.length - i < w.length) continue

                    if (s.substring(i, i + w.length) == w) {
                        tab[i] = tab[i + w.length]
                        break
                    }
                }
            }
            return tab[0]
        }
    }