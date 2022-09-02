

# Unique Paths

### Tabulation

    class Solution {
        fun uniquePaths(m: Int, n: Int): Int {
            val tab = (1..n).asSequence().map { o -> (1..m).asSequence().map { 0 }.toMutableList() }.toList()

            tab[1][1] = 1

            for (i in 1..n - 1) {
                for (j in 1..m - 1) {
                    tab[i][j] = tab[i][j - 1] + tab[i -1][j]
                }
            }

            return tab[n-1][m-1]
        }
    }

---

### Memo

    class Solution {
        fun uniquePaths(m: Int, n: Int): Int {
            val memo = mutableMapOf<String, Int>()

            fun recur(m: Int, n: Int): Int {
                
            }
        }
    }

---

    neet did the tabulation but backwards