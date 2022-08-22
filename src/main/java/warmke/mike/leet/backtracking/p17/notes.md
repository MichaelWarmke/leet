

# Letter Combinations of a Phone Number

    class Solution {
        val letters: MutableMap<Int, MutableList<String>> = mutableMapOf(
            Pair(2, mutableListOf("a", "b", "c")),
            Pair(3, mutableListOf("d", "e", "f")),
            Pair(4, mutableListOf("g", "h", "i")),
            Pair(5, mutableListOf("j", "k", "l")),
            Pair(6, mutableListOf("m", "n", "o")),
            Pair(7, mutableListOf("p", "q", "r", "s")),
            Pair(8, mutableListOf("t", "u", "v")),
            Pair(9, mutableListOf("w", "x", "y", "z"))
            )
    
        fun letterCombinations(digits: String): List<String> {
            val result = mutableListOf<String>()
            val stack = mutableListOf<String>()
    
            fun recur(start: Int): Unit {
                if (start >= digits.length) {
                    result.add(stack.toList().joinToString { it })
                    return
                }
                
                letters[digits[start].digitToInt()]!!.forEach { c ->
                    stack.add(c)
                    recur(start + 1)
                    stack.removeLast()
                }
            }
            recur(0)
            return result.toList()
        }
    }