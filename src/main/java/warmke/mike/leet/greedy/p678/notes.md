

# Valid Parenthesis String

i dont think any of these are correct

brute force 
Time Complexity 3 ^ n

    class Solution {
    
        fun checkValidString(s: String): Boolean {
            tailrec fun valid(ns: String, r: Int, l: Int): Boolean {
                if(ns.isEmpty()) return r == l
                if( l > r) return false
    
                if (ns[0] == '(') {
                    return valid(ns.substring(1), r + 1, l)
                }
    
                if (ns[0] == ')') {
                    return valid(ns.substring(1),r , l + 1)
                }
    
                return valid(ns.substring(1), r , l) ||
                        valid("(" + ns.substring(1), r, l) ||
                        valid(")" + ns.substring(1), r, l)
            }
    
            return valid(s, 0 ,0)
        }
    }

---

DP
Time Complexity O(n^3)


    class Solution {
        val dp = mutableMapOf<String, Boolean>()
    
        fun checkValidString(s: String): Boolean {
            tailrec fun valid(ns: String, r: Int, l: Int): Boolean {
                if(ns.isEmpty()) return r == l
                if( l > r) return false
    
                if (ns[0] == '(') {
                    if (dp[ns.substring(1)] != null) return dp[ns.substring(1)] == true
                    dp[ns.substring(1)] = valid(ns.substring(1), r + 1, l)
                    return dp[ns.substring(1)] == true
                }
    
                if (ns[0] == ')') {
                    if (dp[ns.substring(1)] != null) return dp[ns.substring(1)] == true
                    dp[ns.substring(1)] = valid(ns.substring(1),r , l + 1)
                    return dp[ns.substring(1)] == true
                }
    
                return valid(ns.substring(1), r , l) ||
                        valid("(" + ns.substring(1), r, l) ||
                        valid(")" + ns.substring(1), r, l)
            }
    
            return valid(s, 0 ,0)
        }
    }

---
Neet
Greedy

    class Solution {
    
        fun checkValidString(s: String): Boolean {
            var lMin = 0
            var lMax = 0

            s.forEach {
                if (it == '(') {
                    lMin += 1
                    lMax += 1
                } else if (it == ')') {
                    lMin -= 1
                    lMax -= 1
                } else {
                    lMin -= 1
                    lMax += 1
                }

                if (lMax < 0) return false
                if (lMin < 0) lMin = 0
            }

            return lMin == 0
        }
    }