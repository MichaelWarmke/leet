package warmke.mike.leet

import java.lang.Math.pow
import java.util.*
import kotlin.math.pow

class Solution {

    val result = mutableListOf<List<Int>>()
    lateinit var iCandidates: List<Int>
    var iTarget = 0

    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        iTarget = target
        iCandidates = candidates.toList()

        recur(listOf(), 0)

        return result
    }

    fun recur(curList: List<Int>, i: Int) {
        if (i > iCandidates.size - 1) return
        if (curList.sum() > iTarget) return
        if (curList.sum() == iTarget) {
            result.add(curList)
            return
        }

        val newList = curList.toMutableList()
        newList.add(iCandidates[i])

        recur(newList, i)
        recur(curList, i + 1)
    }
}