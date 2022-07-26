
# Kth Largest element in a Stream

we will keep a min heap of size k

Java and kotlin implementation of a heap is the PriorityQueue
and by default the queue is natural order

so by default it's a min heap
to get a max-heap you need to reverse the comparator

    private val heap = PriorityQueue<Int>(Comparator.reverseOrder())


    class KthLargest(var k: Int, nums: IntArray) {
    
        private val heap = PriorityQueue<Int>()
    
        init {
            heap.addAll(nums.asList())
            while (heap.size > k) {
                heap.remove()
            }
        }
    
        fun add(`val`: Int): Int {
            heap.add(`val`)
    
            if (heap.size > k)
                heap.remove()
    
            return heap.peek()
        }
    
    }