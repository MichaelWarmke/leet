

# Partition Labels


    class Solution {
        fun partitionLabels(s: String): List<Int> {
            val counts = s.groupBy { it }.mapValues { it.value.size }
            val windowCounts = mutableMapOf<Char, Int>()
            val result = mutableListOf<Int>()
    
            var matches = 0
            var l = 0
            var r = 0
    
            val chars = s.toCharArray()
            for (i in chars.indices) {
                if (matches == windowCounts.size) {
                    result.add(r-l)
                    r +=1
                    l = r
                    matches = 0
                    windowCounts.clear()
                }
                
                if (windowCounts[chars[i]] != null) {
                    windowCounts[chars[i]] = windowCounts[chars[i]]!! + 1
                } else {
                    windowCounts[chars[i]] = 1
                }
    
                if (windowCounts[chars[i]] == counts[chars[i]]) matches += 1
                r++
            }
    
            return result
        }
    }

---

you can also just have a map of the last index of the char value

    class Solution {
        fun partitionLabels(s: String): List<Int> {
            val last = mutableMapOf<Char, Int>()
            val result = mutableListOf<Int>()
    
            s.forEachIndexed { i, v -> last[v] = i }
    
            var end = 0
            var begin = 0
    
            s.forEachIndexed { i, v ->
                if (end == i && i != 0) {
                    result.add(end - begin)
                    begin = end
                }
                if (last[v]!! > end) end = i
            }
    
            return result
        }
    }