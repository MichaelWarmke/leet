package warmke.mike.leet.p2131

import kotlin.math.min

class Solution {
    // filter out repeat chars
    fun longestPalindrome(words: Array<String>): Int {

        val filteredWords = words.groupingBy { it }.eachCount().toMutableMap()

        var sum = 0

        val keys = filteredWords.keys.toList()
        keys.forEach {
            var count = filteredWords[it]
            var rcount = filteredWords[it.reversed()]

            if (count != null && rcount != null) {
                val pairs = if (it == it.reversed() && count % 2 == 1) count - 1
                    else if(it == it.reversed() && count % 2 == 0) count
                    else min(count, rcount) * 2
                sum += pairs * 2
                count -= pairs
                rcount -= pairs


                filteredWords[it] = count
                filteredWords[it.reversed()] = rcount
            }
        }

        if (filteredWords.keys.any { it.toCharArray()[0] == it.toCharArray()[1] && filteredWords[it] != 0 })
            sum += 2

        return sum
    }
}