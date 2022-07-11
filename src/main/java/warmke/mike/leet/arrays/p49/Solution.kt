package warmke.mike.leet.arrays.p49

class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        return strs.groupBy { it.toCharArray().sorted() }.values.toList()
    }
}