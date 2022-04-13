package warmke.mike.leet.p2131

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val s = Solution()

    @Test
    fun test() {
//        assertEquals(6, s.longestPalindrome(arrayOf("lc","cl","gg")))
        assertEquals(4, s.longestPalindrome(arrayOf("bb","bb")))
        assertEquals(8, s.longestPalindrome(arrayOf("ab","ty","yt","lc","cl","ab")))
        assertEquals(2, s.longestPalindrome(arrayOf("cc","ll","xx")))
        assertEquals(22, s.longestPalindrome(arrayOf("dd","aa","bb","dd","aa","dd","bb","dd","aa","cc","bb","cc","dd","cc")))
        assertEquals(26, s.longestPalindrome(arrayOf("ll","lb","bb","bx","xx","lx","xx","lx","ll","xb","bx","lb","bb","lb","bl","bb","bx","xl","lb","xx")))
    }
}