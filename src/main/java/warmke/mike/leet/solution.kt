package warmke.mike.leet

import java.lang.Math.*
import java.util.*
import kotlin.math.pow


class Solution {
    val dp = mutableMapOf<String, Boolean>()

    fun checkValidString(s: String): Boolean {
        fun valid(ns: String, r: Int, l: Int): Boolean {
            if(ns.isEmpty()) return r == l

            if (ns[0] == '(') {
                if (dp[ns.substring(1)] != null) return dp[ns.substring(1)] == true
                dp[ns.substring(1)] = valid(ns.substring(1), r + 1, l)
                return dp[ns.substring(1)] == true
            }

            if (ns[0] == ')') {
                if (dp[ns.substring(1)] != null) return dp[ns.substring(1)] == true
                dp[ns.substring(1)] = valid(ns.substring(1),r , l + 1)
                return dp[ns.substring(1)] == true
            }

            return valid("" + ns.substring(1), r , l) ||
                    valid("(" + ns.substring(1), r, l) ||
                    valid(")" + ns.substring(1), r, l)
        }

        return valid(s, 0 ,0)
    }
}