

# Heap Sort

### not in place


    fun sort(array: IntArray): IntArray {
        val result = IntArray(array.size) { 0 }
        val heap = PriorityQueue<Int>()
        heap.addAll(array)

        for ( i in 0..array.size -1) {
            result[i] = heap.remove()
        }

        return result
    }

### in place

    fun sort(array: IntArray): Unit {

        for (i in array.size / 2 - 1 downTo 0) {
            heapify(array, array.size, i)
        }

        for (i in array.size - 1 downTo 1) {
            val temp = array[0]
            array[0] = array[i]
            arrry[i] = temp

            heapify(array, i, 0)
        }
    }

    fun heapify(array: IntArray, size: Int, i: Int): Unit {

        var largest = i
        val leftChild = 2 * i + 1
        val rightChild = 2 * i + 2
        
        // left child larger than root
        if(leftChild < size && array[leftChild] > array[largest]) {
            largest = leftChild
        }

        // right child larger than largest
        if(rightChild < size && array[rightChild] > array[largest]) {
            largest = rightChild
        }

        //swap root with the largest
        if(largest != i) {
            val temp = array[i]
            array[i] = array[largest]
            array[largest] = tmp

            heapify(array, size, largest)
        }
    }