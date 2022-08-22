

# Palindrome Partitioning

    decision here is what is the first partition going to be not add to existing partition or create a new one

    class Solution {
        fun partition(s: String): List<List<String>> {
            val result = mutableListOf<List<String>>()
            val curList = mutableListOf<String>()
    
            fun recur(start: Int) {
                if (start > s.length) {
                    result.add(curList.toList())
                    return
                }
    
                for (i in start until s.length) {
                    val newS = s.substring(start, i)
                    if (isPalin(newS)) {
                        curList.add(newS)
                        recur(i)
                        curList.removeLast()
                    }
                }
            }
            recur(0)
            return result
        }
    
        fun isPalin(s: String): Boolean {
            var l = 0
            var r = s.length - 1
    
            while (l <= r) {
                if (s[l] != s[r]) return false
                l += 1
                r -= 1
            }
            return true
        }
    }