

# MinHeap

    class MinHeap {
     
        val heap: IntArray? 
        var size: Int?
        val maxSize: Int?

        var front = 1

        public constructor MinHeap(size: Int) {
            heap = IntArray(size) { Int.MAX_VALUE }
            size = 0
            maxSize = size
        }

        private fun childRight(n: Int): Int {
            return (2 * n) + 1
        }

        private fun leftChild(n: Int): Int {
            return 2 * n
        } 

        private fun parent(n: Int): Int {
            return n / 2
        }

        private fun swap(n: Int, m: Int): Unit {
            val temp = heap[n]
            heap[n] = heap[m]
            heap[m] = temp
        }

        public fun insert(n: Int): Boolean {
            if (size >= maxsize) {
                return false
            }

            size += 1
            heap[size] = n
            var current = size

            while(heap[current] < heap[parent(current)]) {
                swap(current, parent(current))
                current = parent(current)
            }
        }

        public fun remove(): Int {
            val popped = heap[front]
            heap[front] = heap[size]
            size -= 1

            fun minHeapify(n: Int): Unit {
                if (n > size / 2) return

                var swapPos = n

                if (rightChild(n) <= size) {
                    swapPos = if (heap[leftChild(n)] < heap[rightChild(n)]) leftChild(n) else rightChild(n)
                } else {
                    swapPos = heap[leftChild(n)]
                }

                if (heap[n] > heap[leftChild(n)] || heap[n] > heap[rightChild(n)]) {
                    swap(n, swapPos)
                    minHeapify(swapPos)
                }
            }
            minHeapify(front)
            return popped
        }

        public fun peek(): Int {
            return heap[0]
        }
    }