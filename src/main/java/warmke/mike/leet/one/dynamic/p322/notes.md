

# Coin Change

---

### Brute Force
    m is depth of the tree
    n is the number of coins

    O(n ^ m) Time
    O(m) Space for the call stack

    class Solution {
        fun coinChange(coins: IntArray, amount: Int): Int {
            var min = Int.MAX_VALUE

            fun recur(n: Int, depth: Int = 0): Uint {
                if (n < 0) return
                if (n == 0) {
                    min = min(min, depth)
                    return
                }

                coins.forEach {
                    recur(n - it, depth + 1)
                }
            }

            recur(amount)
            return if (min == Int.MAX_VALUE) -1 else min
        }
    }

---

### Memo Top Down

    O(n * m ^ 2) Time
    O(m ^ 2) Space

    class Solution {
        fun coinChange(coins: IntArray, amount: Int): Int {
            val memo = mutableMapOf<Int, Int>()

            fun recur(n: Int): Int {
                if (memo[n] != null) return memo[n]
                if (n < 0) return Int.MAX_VALUE
                if (n == 0) {
                    return 0
                }

                var localMin = Int.MAX_VALUE

                coins.forEach {
                    localMin = min(localMin, recur(n - it))
                }
                memo[n] = localMin + 1
                return localMin
            }

            val min = recur(amount)
            return if (min == Int.MAX_VALUE) -1 else min
        }
    }

---

### Tabulation Bottom up

    O(amount * coins) Time
    O(amount) Space

    class Solution {
        fun coinChange(coins: IntArray, amount: Int): Int {
            val tab = mutableListOf<Int>(amount + 1) { amount + 1 } 
            tab[0] = 0

            for (a in 1..amount + 1) {
                for (c in coins) {
                    if (a - c >= 0) {
                        tab[a] = min(tab[a], 1 + tab[a-c])
                    }
                }
            }
            val min = tab[amount]
            return if (min == amount + 1) -1 else min
        }
    }