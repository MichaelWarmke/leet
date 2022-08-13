

# Pow

    class Solution {
        fun myPow(x: Double, n: Int): Double {
            if (n == 0) return 1

            var total = if (n > 0) x else 1/x
            var curPow = if (n > 0 ) 1 else -1

            while (curPow < n) {
                if (curPow * 2 < n) {
                    total *= total
                    curPow += curPow
                } else {
                    total *= x
                    curPow += 1
                }
            }

            while (curPow > n) {
                if (curPow * 2 > n) {
                    total *= total
                    curPow += curPow
                } else {
                    total *= x
                    curPow -= 1
                }
            }

            return total
        }
    }