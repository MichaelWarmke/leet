package warmke.mike.leet.p49

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {

    val s =  Solution()

    @Test
    fun test() {
        assertEquals(listOf(listOf("bat"), listOf("nat","tan"), listOf("ate","eat","tea")).map { it.toSet() }.toSet(),
            s.groupAnagrams(arrayOf("eat","tea","tan","ate","nat","bat")).map { it.toSet() }.toSet())
        assertEquals(listOf(listOf("bat"), listOf("nat","tan"), listOf("ate","eat","tea")).map { it.toSet() }.toSet(),
            s.groupAnagrams(arrayOf("eat","tea","tan","ate","nat","bat")).map { it.toSet() }.toSet())
        assertEquals(listOf(listOf("")), s.groupAnagrams(arrayOf("")))
        assertEquals(listOf(listOf("a")), s.groupAnagrams(arrayOf("a")))

    }
}