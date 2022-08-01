

# Climbing Stairs

I would implement a decision tree where you could either take 1 or 2 steps

just keep track of the current number of steps

if it reaches 10 increment the pointer, if goes over 10 return 

but a lot of this can be memoized

this makes the time complexity of O(n)
brute force would be 2 ^ n

this is a bottom up DP approach

class Solution {

    val map = mutableMapOf<Int,Int>()

    fun climbStairs(n: Int): Int {
        if (n < 0) return 0
        if (n == 0) return 1
        if (map[n] != null) return map[n]!!

        map[n] = climbStairs(n - 1) + climbStairs(n - 2)

        return map[n]!!
    }

}

---

apparently this is fib problem 
so you could just find the fib number for n + 1
