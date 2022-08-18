

# Merge k sorted lists

    m = total number of elements
    loop to find min O(k * m) space O(k)

    minHeap to find the min O(mlogk)
    this is O(nlogk) ? right?
    also this is heapsort

    class Node(val value: Int, var right: Node?) : Comparable<Node> {
        override fun compareTo(other: Node): Int {
            return this.value.compareTo(other.value)
        }
    }
    
    class Solution {
        fun mergeKLists(lists: Array<Node?>): Node? {
            var head: Node? = null
            var cur: Node? = null
            val minHeap = PriorityQueue<Node>()
        
            lists.asSequence().filterNotNull().forEach { minHeap.add(it) }
    
            while(!minHeap.isEmpty()) {
                val min = minHeap.peek()
    
                if (head == null) {
                    head = min
                    cur = min
                } else {
                    cur!!.right = min
                    cur = min
                }
                minHeap.remove(min)
                min.right.let {
                    minHeap.add(it)
                }
            }
            return head
        }
    }

---

neet did this using mergesort