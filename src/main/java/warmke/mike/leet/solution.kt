package warmke.mike.leet

import java.lang.Math.*
import java.util.*
import kotlin.math.pow


class Solution {


}
fun spiralOrder(matrix: Array<IntArray>): List<Int> {
    val result = mutableListOf<Int>()

    var top = 0
    var bottom = matrix.size - 1
    var left = 0
    var right = matrix[0].size - 1

    while (left < right && top < bottom) {
        for (i in left..right) {
            result.add(matrix[top][i])
        }
        top += 1

        for (i in top..bottom) {
            result.add(matrix[i][right])
        }
        right -= 1

//        if (!(left < right && top < bottom)) break

        for (i in right downTo left) {
            result.add(matrix[bottom][i])
        }
        bottom -= 1

        for (i in bottom downTo top) {
            result.add(matrix[i][left])
        }
        left += 1
    }
    return result
}

fun main() {

    for (i in 1..5) {
        println(i)
    }

    println(spiralOrder(arrayOf(intArrayOf(1,2,3), intArrayOf(4,5,6), intArrayOf(7,8,9))))
}