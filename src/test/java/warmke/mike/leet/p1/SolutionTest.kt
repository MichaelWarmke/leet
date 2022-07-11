package warmke.mike.leet.p1

import org.junit.jupiter.api.Test
import warmke.mike.leet.arrays.p1.Solution
import kotlin.test.assertEquals

class SolutionTest {

    val s = Solution()

    @Test
    fun test() {
        assertEquals(intArrayOf(0,1).toSet(), s.twoSum(intArrayOf(2,7,11,15), 9).toSet())
        assertEquals(intArrayOf(1,2).toSet(), s.twoSum(intArrayOf(3,2,4), 6).toSet())
        assertEquals(intArrayOf(0,1).toSet(), s.twoSum(intArrayOf(3,3), 6).toSet())
        assertEquals(intArrayOf(0,3).toSet(), s.twoSum(intArrayOf(0,4,3,0), 0).toSet())
        assertEquals(intArrayOf(0,3).toSet(), s.twoSum(intArrayOf(-3,4,3,90), 0).toSet())
    }
}