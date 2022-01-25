package warmke.mike.leet.p24

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val s = Solution()

    @Test
    fun test() {
        assertEquals(null, s.swapPairs(null))
        assertEquals(createList(mutableListOf(1)), s.swapPairs(createList(mutableListOf(1))))
        aList(mutableListOf(2,1), mutableListOf(1,2))
        aList(mutableListOf(2,1,4,3), mutableListOf(1,2,3,4))
        aList(mutableListOf(2,1,4,3,5), mutableListOf(1,2,3,4,5))
    }

    fun aList(eInts: MutableList<Int>, aInts: MutableList<Int>) {
        assertEquals(eInts, toList(s.swapPairs(createList(aInts))))
    }

    fun toList(node: ListNode?): List<Int> {
        val result = mutableListOf<Int>()
        var p = node
        while (p != null) {
            result.add(p.`val`)
            p = p.next
        }
        return result
    }

    fun createList(ints: MutableList<Int>): ListNode? {
        if (ints.isEmpty()) return null

        var p = ListNode(ints[0])
        val original = p
        ints.removeAt(0)

        ints.forEach {
            val node = ListNode(it)
            p.next = node
            p = node
        }
        return original
    }
}