

# Merge Triplets to Form Target Triplet

    class Solution {
        fun mergeTriplets(triplets: Array<IntArray>, target: IntArray): Boolean {
            var x = false
            var y = false
            var z = false

            triplets.forEach { 
                if (target[0] == it[0] && target[1] <= it[1] && target[2] <= it[2]) {
                    x = true
                }

                if (target[0] <= it[0] && target[1] == it[1] && target[2] <= it[2]) {
                    y = true
                }

                if (target[0] <= it[0] && target[1] <= it[1] && target[2] == it[2]) {
                    z = true
                }

                if (x && y && z) return true
            }

            return false
        }
    }