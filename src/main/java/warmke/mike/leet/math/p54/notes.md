

# Spiral Matrix

    class Solution {

        fun  sprialOrder(matrix: Array<IntArray>): List<Int> {
            val result = mutableListOf<Int>()

            var top = 0
            var bottom = matrix.size
            var left = 0 
            var right = matrix[0].size

            while (left < right && top < bottom) {
                for (i in 0..(right - left)) {
                    result.add(matrix[top][i])
                }
                top += 1
    
                for (i in 0..(bottom - top)) {
                    result.add(matrix[i][right])
                }
                right -= 1
                
                if (!(left < right && top < bottom)) break

                for (i in (right - left)..-1) {
                    result.add(matrix[bottom][i])
                }
                bottom -= 1
    
                for (i in (bottom - top)..-1) {
                    result.add(matrix[i][left])
                }
                left += 1
            }
            return result
        }
    }

    top = 1
    bottom = 1
    right = 2
    left = 1 