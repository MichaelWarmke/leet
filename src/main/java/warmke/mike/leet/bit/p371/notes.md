

# Sum of Two Integers

    class Solution {
        fun getSum(a: Int, b: Int): Int { 
            var res = 0
            var carry = 0
            var intMask = 1

            for (i in 0..31) {
                val maskA = a and intMask                 
                val maskB = b and intMask

                var bit = a xor b xor carry
                carry = (a and b) or (b and carry) or (a and carry)
                bit = bit shl i  

                res = res | bit
            }

            return res
        }
    }