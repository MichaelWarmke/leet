

# Hand of Straights

nlogn for sorting
n for looping through the sorted array

class Solution {

    fun isNStraightHand(hand: IntArray, groupSize: Int): Boolean {
        if (hand.size % groupSize != 0) return false

        val sortedHand = hand.sorted()
        val groups = mutableListOf<MutableSet<Int>>()

        for (i in 0 until hand.size / groupSize) {
            groups.add(mutableSetOf())
        }

        for (i in hand.indices) {
            val group: MutableSet<Int>? = groups.find { it.size != groupSize && !it.contains(sortedHand[i]) }

            if (group == null || (group.isNotEmpty() && group.contains(sortedHand[i] - 1))) return false

            group.add(sortedHand[i])
        }

        return true
    }

}