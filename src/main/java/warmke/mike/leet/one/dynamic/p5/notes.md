

# Longest Palindromic Substring

    class Solution {
        fun longestPalindrome(s: String): String {
            var result = ""

            for (i in 0..s.length) {
                
                val odd = longestPalin(i, i, s)
                val even = longestPalin(i, i + 1, s)

                if (odd > result) {
                    result = odd
                }

                if (even > result) {
                    result = even
                }
            }
            return result
        }

        fun longestPalin(var l: Int, var r: Int, s: String): String {
            var res = ""
            while (l >= 0 && r < s.length && s[l] == s[r]) {
                if ((r - l + 1) > res.length) {
                    res = s.substring(l, r + 1)
                }
                l -= 1
                r += 1
            } 
            return res
        }
    }