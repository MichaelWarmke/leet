

# Reverse Nodes in k-Group

---

    im just going to copy this one. this one is good constant mem
    i think it would be easier to just throw then into a list/stack/queue and process then that way not performant though

    data class ListNode(val value: Int, val next: ListNode?) {}

    class Solution {
         fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
            val dummyHead = ListNode(0, head)
            var groupPrev = dummy

            var i = 0 
            while (true) {
                val kth = getKth(groupPrev, k)
                if (kth == null) break

                val groupNext = kth.next

                val prev: ListNode? = kth.next
                val cur = groupProv.next
                
                while (cur != groupNext) {
                    val tmp = cur.next
                    cur.next = prev
                    prev = cur
                    cur = tmp
                }

                val tmp = groupPrev.next
                groupPrev.next = kth
                groupPrev = tmp
            }

            fun getKth(cur: ListNode?, k: Int) {
                while (cur.next != null and k > 0) {
                    cur = cur.next
                    k -= 1
                }
                return cur
            }
        }
    }