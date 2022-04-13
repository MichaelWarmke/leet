package warmke.mike.leet.p242

class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val sMap = s.split("").groupBy { it }.mapValues { it.value.size }
        val tMap = t.split("").groupBy { it }.mapValues { it.value.size }
        return sMap == tMap
    }
}