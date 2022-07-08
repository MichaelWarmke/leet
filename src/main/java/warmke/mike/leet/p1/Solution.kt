package warmke.mike.leet.p1

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        tailrec fun go(checked: Map<Int, Int> = emptyMap(), index: Int = 0): IntArray {
            val other = target - nums[index]
            return if (checked.containsKey(other)) intArrayOf(checked.getValue(other), index)
            else go(checked + (nums[index] to index), index + 1)
        }

        return go()
    }
}