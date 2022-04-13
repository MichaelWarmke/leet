package warmke.mike.leet.p217

class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        return nums.size != nums.toSet().size
    }
}