

# Decode Ways

    class Solution {
        fun numDecodings(s: String): Int {
            var result = 0

            fun recur(i: Int): Uint {
                if (s[i] == '0') return
                if (i == s.length) {
                    result += 1
                    return
                }

                recur(i + 1)

                if (i + 1 < s.length && s[i].digitOf() <= 2 && s[i + 1].digitOf() <= 6) {
                    recur(i + 2)
                }
                
            }
            recur(0)
            return result
        }
    }

---

    class Solution {
        fun numDecoding(s: String): Int {
            val dp = mutableMapOf<Int, Int>()
            dp[s.length] = 1

            fun recur(i: Int): Int {
                if (s[i] == '0') return 0
                if (dp[i] != null) return dp[i]
                
                var res = recur(i + 1)
                if (i + 1 < s.length && s[i].digitOf() <= 2 && s[i + 1].digitOf() <= 6) {
                    res += recur(i + 2) 
                }

                dp[i] = res
                return res
            }
            return recur(0)
        }

    }