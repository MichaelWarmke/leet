

# Number of 1 Bits

    class Solution {
        // you need treat n as an unsigned value
        fun hammingWeight(n:Int):Int {
            val longN = abs(n.toLong())
            var intMask = 1
            var total = 0

            for (i in 0..31) {
                if (intMask and n > 0) total += 1
                intMask = intMask shl 1
            }
        }
    }

    while (n != 0) {
        n = n and (n -1)
    }