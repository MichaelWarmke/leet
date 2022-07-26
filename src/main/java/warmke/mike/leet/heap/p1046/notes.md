

# Last Stone Weight

we are going to use a max heap

O(1) average O(logn) worst for inserting into the heap

O(1) for looking at the max

O(logn) for removing the max

O(n) to loop through all the stones

overall O(nlogn)

    class Solution {
    
        fun lastStoneWeight(stones: IntArray): Int {
            val maxHeap = PriorityQueue<Int>(Comparator.reverseOrder())
            maxHeap.addAll(stones.asList())
    
            while (maxHeap.size > 1) {
                val y =  maxHeap.remove()
                val x =  maxHeap.remove()
    
                if (x != y) {
                    maxHeap.add(y -x)
                } 
            }
            
            return maxHeap.peek()
        }
    
    }