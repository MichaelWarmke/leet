package warmke.mike.leet.p2116

import java.util.*

class Solution {
    fun canBeValid(s: String, locked: String): Boolean {
        if (s.isEmpty() || s.length % 2 == 1) return false

        val lockedStack = LinkedList<Int>()
        val unlockedStack = LinkedList<Int>()

        for (i in s.indices) {

            if (locked[i] == '0') {
                unlockedStack.push(i)
            }

            if (s[i] == '(' && locked[i] == '1') {
                lockedStack.push(i)
            }

            if (s[i] == ')' && locked[i] == '1') {
                when {
                    lockedStack.isNotEmpty() -> lockedStack.pop()
                    unlockedStack.isNotEmpty() -> unlockedStack.pop()
                    else -> return false
                }
            }
        }

        while (lockedStack.isNotEmpty()) {
            if (unlockedStack.isEmpty() || unlockedStack.peek() < lockedStack.peek())
                return false

            unlockedStack.pop()
            lockedStack.pop()
        }

        return true
    }
}