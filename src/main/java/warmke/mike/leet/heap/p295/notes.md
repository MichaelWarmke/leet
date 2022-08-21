

# Find Median from Data Stream

    what does peeking do to a empty heap?

    class MedianFinder() {

        val smallq = PriorityQueue<Int>() // maxHeap
        val largeq = PriorityQueue<Int>(Comparator.reverseOrder()) // minHeap
    
        fun addNum(num: Int) {
            val m = findMedian()
    
            if (num > m) {
                largeq.add(num)
            } else {
                smallq.add(num)
            }
    
            if (smallq.size > largeq.size + 1) {
                largeq.add(smallq.remove())
            }
    
            if (largeq.size > smallq.size + 1) {
                smallq.add(largeq.remove())
            }
        }
    
        fun findMedian(): Double {
            val small = if (smallq.isEmpty()) 0 else smallq.peek()
            val large = if (largeq.isEmpty()) 0 else largeq.peek()
            
            return when {
                smallq.size == largeq.size -> ((small + large) / 2)
                smallq.size > largeq.size -> small
                else  -> large
            }.toDouble()
        }
    }