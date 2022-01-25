package warmke.mike.leet.p12

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val s = Solution()

    @Test
    fun test() {
        assertEquals(s.intToRoman(3), "III")
        assertEquals(s.intToRoman(4), "IV")
        assertEquals(s.intToRoman(58), "LVIII")
        assertEquals(s.intToRoman(1994), "MCMXCIV")
    }

}