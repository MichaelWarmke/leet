

# Rotate Image


    class Solution {
        
        fun rotate(matrix: Array<IntArray>): Uint {

            var l = 0
            var r = matrix[0].size - 1

            while (l < r) {
                for (i in r..l) {
                    var t = l
                    var b = r

                    val topLeft = matrix[t][l + i]

                    matrix[t][l + i] = matrix[b - i][l]
                    matrix[b - i][l] = matrix[b][r - i]
                    matrix[b][r - i] = matrix[t + i][r]
                    matrix[t + i][r] = tepleft
                }
                r -= 1
                l += 1
            }
        }
    }