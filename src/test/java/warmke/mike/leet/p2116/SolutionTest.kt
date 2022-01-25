package warmke.mike.leet.p2116

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest {

    private val s = Solution()

    @Test
    fun test() {
        assertEquals(false, s.canBeValid(")", "0"))
        assertEquals(true, s.canBeValid("()", "11"))
        assertEquals(true, s.canBeValid("(()())", "111111"))
        assertEquals(true, s.canBeValid("()()", "0000"))
        assertEquals(true, s.canBeValid("))()))", "010100"))
        assertEquals(false, s.canBeValid("())(()(()(())()())(())((())(()())((())))))(((((((())(()))))(",
                        "100011110110011011010111100111011101111110000101001101001111"))

        assertEquals(false, s.canBeValid("))))(())((()))))((()((((((())())((()))((((())()()))(()",
                "101100101111110000000101000101001010110001110000000101"))

        assertEquals(true, s.canBeValid(
                    "())()))()(()(((())(()()))))((((()())(())",
                "1011101100010001001011000000110010100101"))

    }

}