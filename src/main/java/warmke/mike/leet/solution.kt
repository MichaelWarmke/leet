package warmke.mike.leet

import java.lang.Math.*
import java.util.*
import kotlin.collections.ArrayDeque
import kotlin.math.pow


class Node(val i: Int, var left: Node?, var right: Node?)

fun traverse(root: Node?) {
    if (root == null) return
    val queue = ArrayDeque<Node>()
    queue.addLast(root)

    while (queue.isNotEmpty()) {
        val cur = queue.removeFirst()
        print(cur.i)

        if (cur.left != null) { queue.addLast(cur.left!!) }
        if (cur.right != null) { queue.addLast(cur.right!!) }
    }

    "".toCharArray().forEach { print(it) }

    val array = IntArray(5)
    array.size
}
