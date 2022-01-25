package warmke.mike.leet.p2135

class Solution {

//    fun wordCount(startWords: Array<String>, targetWords: Array<String>): Int {
//
//        if (startWords.isEmpty() || targetWords.isEmpty()) return 0
//
//        val startWordMasks = HashSet<Int>()
//
//        startWords.forEach {
//            startWordMasks.add( it.toCharArray().fold(0) { acc, c -> acc or (1 shl c - 'a') })
//        }
//
//
//
//        return targetWords.fold(0) { sum, target ->
//            val range = 1..target.length
//            val tMask = target.toCharArray().fold(0) { acc, c -> acc or (1 shl c - 'a') }
//            val temp = tMask
//            sum + if (range.any { startWordMasks.contains(
//                            tMask or (1 shl it)
//                    ) })
//                1 else 0
//        }
//    }

    fun wordCount(startWords: Array<String>, targetWords: Array<String>): Int {

        if (startWords.isEmpty() || targetWords.isEmpty()) return 0

        val startWordMasks = HashSet<String>()

        startWords.forEach {
            val chars = it.toCharArray()
            startWordMasks.add(
                    chars.sorted().joinToString("")
            )
        }

        return targetWords.fold(0) { sum, target ->
            val tc = target.toCharArray()
            val sortedTarget = tc.sorted().joinToString("")
            sum + if (target.indices.any {
                        val ct = sortedTarget.removeRange(it, it + 1)
                        startWordMasks.contains(ct)
            }) 1 else 0
        }
    }
}