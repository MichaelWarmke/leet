

# Counting Bits

    O(nlogn)

    class Solution {
        fun countBits(n: Int): IntArray {
            var res = intArrayOf()

            for (i in 0..n) {
                res.add(countOnes(i))
            }
            return res
        }

        fun countOnes(n: Int): Int {
            var temp = n.toInt()
            var total = 0            

            while (temp != 0) {
                temp = temp and (temp - 1)
                total += 1
            }

            return total
        }
    }

---

    dp solution

    class Solution {
        fun countBits(n: Int): IntArray {
            var res = mutableListOf<Int>()
            var offest = 1
            res.add(0)

            for (i in 1..n + 1) {
                if (res.size % 2) offset * 2
                res.add(1 + res[i - offset])
            }
            return res.toIntArray()
        }
    }