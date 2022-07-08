package warmke.mike.leet.p238

class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {

        var lastPrefix = 1
        var lastPostfix = 1
        var prefixArray = nums.map {
            lastPrefix *= it
            lastPrefix
        }

        val postfixArray = (nums + intArrayOf(1))
            .zip(prefixArray)
            .reversed()
            .map {
                lastPostfix *= it.first
                it.second * lastPostfix
            }




        return intArrayOf();
    }
}