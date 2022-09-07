

# Linked List

### Reverse Linked List

    data class Node(val v: Int, val next: Node?)

    fun reverse(root: Node?) Node? {
        if (root == null) return null

        var previous: Node? = null
        var current = root

        while (current != null) {
            val temp = current.next
            current.next = previous
            previous = current
            current = temp
        }
        
        return previous
    }