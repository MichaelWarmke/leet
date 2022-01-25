package warmke.mike.leet.p12

import kotlin.math.absoluteValue

class Solution {

    fun intToRoman(num: Int): String {
        val symbolMap = mapOf(
                1000 to "M",
                900 to "CM",
                500 to "D",
                400 to "CD",
                100 to "C",
                90 to "XC",
                50 to "L",
                40 to "XL",
                10 to "X",
                9 to "IX",
                5 to "V",
                4 to "IV",
                1 to "I",
                )

        var mutableNumber = num
        val result = StringBuilder()

        symbolMap.forEach {
            while (mutableNumber > 0 && mutableNumber / it.key != 0) {
                result.append(it.value)
                mutableNumber -= it.key
            }
        }

        return result.toString()
    }
}