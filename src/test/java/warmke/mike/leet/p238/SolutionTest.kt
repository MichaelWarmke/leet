package warmke.mike.leet.p238

import org.junit.jupiter.api.Test
import warmke.mike.leet.arrays.p238.Solution
import kotlin.test.assertEquals

class SolutionTest {

    val s = Solution()

    @Test
    fun test() {
        assertEquals(intArrayOf(24,12,8,6), s.productExceptSelf(intArrayOf(1,2,3,4)))
    }
}