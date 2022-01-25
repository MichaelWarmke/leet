package warmke.mike.leet.p24

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ListNode) return false

        if (`val` != other.`val`) return false
        if (next != other.next) return false

        return true
    }

    override fun hashCode(): Int {
        var result = `val`
        result = 31 * result + (next?.hashCode() ?: 0)
        return result
    }
}

class Solution {

    fun swapPairs(head: ListNode?): ListNode? {
        return swapPairs(head, null)
    }

    fun swapPairs(head: ListNode?, p: ListNode?): ListNode? {
        if (head?.next == null) return head

        val one = head
        val two = head.next
        val three = head.next?.next

        two!!.next = one
        one.next = three

        if (p != null) {
            p.next = two
        }

        if (three != null) {
            swapPairs(three, one)
        }

        return two
    }
}