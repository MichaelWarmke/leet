package warmke.mike.leet.p242

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {

    val s = Solution()

    @Test
    fun test() {
        assertEquals(true, s.isAnagram("anagram", "nagaram"))
        assertEquals(false, s.isAnagram("rat", "car"))
    }
}