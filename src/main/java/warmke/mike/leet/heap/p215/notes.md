

# Kth Largest element in an Array

we are going to use a max heap to get a time complexity of klogn instead of nlogn

this is still not the right time complexity we need O(n)


    class Solution {
        fun  findKthLargest(nums: IntArray, k: Int): Int {
            val maxHeap = PriorityQueue<Int>(Comparator.reverseOrder())
    
            nums.forEach { maxHeap.add(it) }
    
            while (maxHeap.size > k) {
                maxHeap.remove()
            }
    
            return maxHeap.peek()
        }
    }


---

Neetcode

QuickSelect algo
similar to quicksort

average time complexity O(n)

class Solution {
    var ik = 0
    lateinit val inums

    fun  findKthLargest(nums: IntArray, k: Int): Int {
        inums = nums
        ik = k

        return quickSelect(0, nums.size -1)
    }

    fun quickSelect(r: Int, l: Int) {
        val pivot = nums[r]
        val p = l

        for (i in l..r) {
            if (nums[i] <= pivot) {
                val temp = nums[p]
                nums[p] = nums[i]
                nums[i] = temp
                p += 1
            }
        }
        val temp = nums[p]
        nums[p] = nums[r]
        nums[r] = temp

        if (p > ik) return quickSelect(l, p - 1)
        if (p < ik) return quickSelect(p + 1, r)
        if (p == ik) return nums[p] 
    }
}