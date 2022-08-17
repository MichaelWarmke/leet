

# Detect Squares

    O(n) time and space 

    data class Point(val x: Int, val y: Int)

    class DetectSquares() {
    
        val ptsCount = mutableMapOf<Point, Int>()
        val pts = mutableListOf<Point>()

        fun add(point: IntArray) {
            val p = Point(point[0], point[1])
            ptsCount[p] += 1
            pts.add(p)
        }
    
        fun count(point: IntArray): Int {
            var result = 0
            val px = point[0]
            val py = point[1]
            pts.forEach {
                if ((abs(px - it.x) == abs(py - it.y)) && px != it.x && py != it.y) {
                    result+ = ptsCount[Point(px, it.x)] * ptsCount[Point(py, it.y)]
                }
            }
            return result
        }
    
    }