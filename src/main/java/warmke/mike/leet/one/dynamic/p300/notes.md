

# Longest Increasing Subsequence

    tab bottom up

    O(n^2) Time
    O(n) Space

    class Solution {
        fun lengthOfLIS(nums: IntArray): Int {
            val tab = (0..nums.size)asSequence().map { 1 }.toMutableList();
            
            for (i in nums.size - 2 downTo 0) {
                for (j in i + 1..nums.size - 1) {
                    if (nums[i] < nums[j]) {
                        tab[i] = max(tab[i], 1 + tab[j])
                    }
                }
            }
            return tab.maxOf { it }
        }
    }

---

    brute force 
    O(2^n) Time
    O(n) Space