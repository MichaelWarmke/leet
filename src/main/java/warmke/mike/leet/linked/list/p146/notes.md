

# LRU Cache

    data class Node(val key: Int, val value: Int, var left: Node?, var right: Node?) {}
    
    class LRUCache(val capacity: Int) {
    
        val map = mutableMapOf<Int, Node>()
        var start: Node? = null
        var end: Node? = null
        var size = 0
    
        fun get(key: Int): Int {
            if (!map.contains(key)) return -1
    
            var target = map[key]
            var left = target?.left
            var right = target?.right
    
            left?.right = right
            right?.left = left
    
            target?.right = start
            target?.left = null
            start?.left = target
    
            start = target
    
            return target!!.value
        }
    
        fun put(key: Int, value: Int): Unit {
            val newNode = Node(key, value, null, start)
            start = newNode
            size += 1
            map[key] = newNode
    
            if (size > capacity) {
                map.remove(end?.key)
                end = end?.left
                size -= 1
            }
        }
    }
