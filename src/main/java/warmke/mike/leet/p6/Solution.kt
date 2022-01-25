package warmke.mike.leet.p6

class Solution {
    fun convert(s: String, numRows: Int): String {

        val bufs = mutableListOf<StringBuffer>()

        repeat(numRows) {
            bufs.add(StringBuffer())
        }

        var goingDown = false
        var currentBuf = 0


        for (char in s) {
            bufs[currentBuf].append(char)

            if (numRows == 1) continue

            if (currentBuf == 0 || currentBuf == numRows - 1) {
                goingDown = !goingDown
            }

            if (goingDown) {
                currentBuf++
            } else {
                currentBuf--
            }
        }

        return bufs.joinToString("") { it.toString() }
    }
}