

# mergeSort

### not in place

    fun sort(array: IntArray): IntArray {
        if (array.size < 2) return array
        return merge(sort(array.copyRange(0, array.size / 2)), sort.copyRange((array / 2) +1, array.size)
    }

    fun merge(arr1: IntArray, arr2: IntArray): IntArray {
        val totalSize = arr1.size + arr2.size
        val result = IntArray(totalSize)

        var i = 0
        var p1 = 0
        var p2 = 0

        while(i < totalSize ) {
            if (arr1[p1] < arr2[p2]) {
                result[i] = arr1[p1]
                p1 += 1
            } else {
                result[i] = arr2[p2]
                p2 += 1
            }
            i += 1
        }
    }

### in place

    fun sort(array: IntArray): Unit {

        fun recur(l: Int, r: Int) {
            if (l >= r) return 

            val mp = l + (r - l) / 2

            recur(l, mp)
            recur(mp + 1, r)
    
            merge(array, l, mp + 1, mp - l, r - mp + 1)
        }
    }

    fun merge(array: IntArray, s1: Int, s2: Int, s1size: Int, s2size: Int): Unit {
        val totalSize = s1size + s2size
        val result = IntArray(totalSize)
        var i = 0
        var p1 = s1
        var p2 = s2

        // merge until one pointer goes out of bounds
        while( p1 <= s1 + s1size && p2 <= s2 + s2size ) {
            if (array[p1] < array[p2]) {
                result[i] = arr1[p1]
                p1 += 1
            } else {
                result[i] = arr2[p2]
                p2 += 1
            }
            i += 1
        }

        // merge remaining elements
        while (i < totalSize) {
            if (p1 <= s1 + s1size) {
                result[i] = arr1[p1]
                p1 += 1
            } else {
                result[i] = arr2[p2]
                p2 += 1
            }
            i += 1
        }

        // copy temp back into array
        for (i in min(s1,s2)..totalSize) {
            array[s1 + i] = result[i]
        }
    }

### linkedList

    data class Node(val v: Int, val next: Node?)

    fun sort(lists: Array<Node?>): Node? {
        val size = lists.size
        var interval = 1

        while (interval < size) {
            for(var i = 0; i < size - interval; i += 2 * interval) {
                list[i] = merge(lists[i], lists[i + interval])
            }
            interval = interval * 2
        }
        return if (size > 0) lists[0] else null
    }

    fun merge(l1: Node?, l2: Node?): Node? {
        if (l2 == null) return l1
        if (l1 == null) return l2
        
        val root = if (l1.v < l2.v) l1 else l2
        var cur  = root
        var cur1 = l1
        var cur2 = l2

        while (cur1 != null && cur2 != null) {
            cur.next = if (cur1.v < cur2.v) {
                val temp = cur1
                cur1 = cur1.next
                temp
            } else { 
                val temp = cur2
                cur2 = cur2.next
                temp
            }
            cur = cur.next
        }

        if (cur1 != null) {
            cur.next = cur1
        } else {
            cur.next = cur2
        }
        return root
    }
}