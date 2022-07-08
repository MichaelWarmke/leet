package warmke.mike.leet.p347

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {

    val s = Solution()

    @Test
    fun test() {
        assertEquals(intArrayOf(1,2).toSet(), s.topKFrequent(intArrayOf(1,1,1,2,2,3), 2).toSet())
        assertEquals(intArrayOf(1).toSet(), s.topKFrequent(intArrayOf(1), 1).toSet())
    }
}