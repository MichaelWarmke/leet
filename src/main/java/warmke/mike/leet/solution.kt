package warmke.mike.leet

import java.lang.Math.pow
import kotlin.math.pow

class Solution {
    fun plusOne(digits: IntArray): IntArray {

        for (i in digits.size downTo 0) {
            if (i == 0 &&  digits[i] == 9) {
                val result = digits.toMutableList()
                result.add(0, 1)
                return result.toIntArray()
            }

            if (digits[i] != 9) {
                digits[i] = digits[i] + 1
                return digits
            }

            digits[i] = 0
        }

        return digits
    }


}

val m = mutableMapOf<String, List<String>>()

