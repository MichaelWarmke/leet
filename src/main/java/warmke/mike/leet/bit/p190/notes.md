

# Reverse Bits

    class Solution {
        // you need treat n as an unsigned value
        fun reverseBits(n:Int):Int {
            var result = if (n and 1) 1 else 0
            var tempN = n
            

            for (i in 0..30) {
                result = result shl 1
                tempN = tempN shr 1
                if (tempN and 1) {
                    result += 1
                }
            }
            return result
        }
    }