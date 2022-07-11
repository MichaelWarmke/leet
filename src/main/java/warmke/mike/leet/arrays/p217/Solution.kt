package warmke.mike.leet.arrays.p217

class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        return nums.size != nums.toSet().size
    }
}