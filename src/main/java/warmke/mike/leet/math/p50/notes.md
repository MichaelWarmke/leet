

# Pow

    doing the divide and conquor trick, the time complexity is O(logn)
    without it is O(n)

    class Solution {
        fun myPow(x: Double, n: Int): Double {
            if (n == 0) return 1
            if (x == 0) return 0

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

---

    recursively 

    class Solution {
        fun myPow(x: Double, n: Int): Double {
            if (n == 0) return 1
            if (x == 0) return 0

            if (n / 2 == 0) {
                return myPow(x, n / 2) * myPow(x, n / 2)
            }

            if (n > 0) {
                return myPow(x, n + 1) / x
            }

            return myPow(x, n -1) * x
        } 
    }