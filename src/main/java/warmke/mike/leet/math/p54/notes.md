

# Spiral Matrix

    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        val result = mutableListOf<Int>()
    
        var top = 0
        var bottom = matrix.size - 1
        var left = 0
        var right = matrix[0].size - 1
    
        while (left <= right && top <= bottom) {
            for (i in left..right) {
                result.add(matrix[top][i])
            }
            top += 1
    
            for (i in top..bottom) {
                result.add(matrix[i][right])
            }
            right -= 1
    
            if (!(left < right && top < bottom)) break
    
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

    top = 1
    bottom = 1
    right = 2
    left = 1 