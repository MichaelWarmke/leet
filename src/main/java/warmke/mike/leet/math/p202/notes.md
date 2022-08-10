

# Happy Number

    class Solution {

        fun isHappy(n: Int): Boolean {
            val previousNums =  mutableSetOf<Int>()
            var m = n
    
            while(m != 1) {
                if (previousNums.contains(m)) return false
    
                var cur = m.toDouble()
                var total = 0
                while (cur > 0) {
                    total +=  (cur % 10).pow(2).toInt()
                    cur /= 10
                }
    
                m = total
                previousNums.add(total)
            }
            return true
        }
    }