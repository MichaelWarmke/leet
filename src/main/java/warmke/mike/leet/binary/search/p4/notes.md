

# Median of Two Sorted Arrays


    class Solution {
        fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
            var A = nums1
            var B = nums2
            val total = nums1.size + nums2.size
            val half = total / 2

            if (nums1.size < nums2.size) {
                A = B
                B = nums1
            }

            var l = 0
            var r = nums1.size
            while (true) {
                i = (l + r) / 2
                j = half - i - 2

                Aleft = if (i >= 0) A[i] else Integer.MIN_VALUE
                Aright = if ((i + 1) < A.size) A[i + 1] else Integer.MAX_VALUE
                Bleft = if (j >= 0) B[j] else Integer.MIN_VALUE
                Bright = if ((j + 1) < B.size) [j + 1] else Integer.MAX_VALUE

                if (Aleft <= Bright and Bleft <= Aright) {
                    if (total % 2 == 0) {
                        return min(Aright, Bright)
                    } 
                    return (max(Aleft, Bleft) + min(Aright,Bright)) / 2
                } else if (Aleft > Bright) {
                    r = i - 1
                } else {
                    l = i + 1
                }
            }
        }
    }


    1 2 3 4 
    5 6 7 8
    
    5 6 7 8
    1 2 3 4

    1 2 3 4
    2 3 4 5

    1 2 3 4 
    5 6

    