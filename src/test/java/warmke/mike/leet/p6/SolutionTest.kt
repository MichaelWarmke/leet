package warmke.mike.leet.p6

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val s = Solution()

    @Test
    fun test() {
        assertEquals("A", s.convert("A",1))
        assertEquals("AB", s.convert("AB",1))
        assertEquals("PAHNAPLSIIGYIR", s.convert("PAYPALISHIRING",3))
        assertEquals("PINALSIGYAHRPI", s.convert("PAYPALISHIRING",4))
    }
}