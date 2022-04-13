package warmke.mike.leet.p217

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest {
    val s = Solution()

    @Test
    fun test() {
        assertEquals(true ,s.containsDuplicate(intArrayOf(1,2,3,1)))
        assertEquals(false ,s.containsDuplicate(intArrayOf(1,2,3,4)))
    }

}
