

# Hash Table

- load factor, how much of the table is actually used or how many buckets are used out of the available

### linear probing

    when an item is insert and the there is a collision
    we would them store the object at the next available slot in the table

        class HT(var size: Int = 100) {
        [0] = key
        [1] = value
        [2] = isDeleted
        var array = Array<IntArray>(size) { intArrayof(0,0,0) }
        
        // every java object comes with a hashcode
        //the job of this function should be to map that hashcode onto a set of indeces
        fun hash(s: String): Int {
            return s.chars().sum()
        }

        fun insert(key: String, v: Int): Boolean {
            var index = hash(key) % size 
            if (array[index][0] == 0 && array[index][2] != 1) {
                array[index][0] = key
                array[index][1] = v
                return true
            } 

            while(array[index][0] != 0 && array[index][2] == 1 && index < size) {
                index += 1
            }

            if (index >= size) return false
            array[index][0] = key
            array[index][1] = v
        }
        
        fun get(key: String): Int? {
            var index = hash(key) % size
            if (array[index][0] == key) return array[index][1]

            while(index < size && array[index][0] != key && array[index][2] != 1) {
                index += 1 
            }
            return if (array[index][0] == key) array[index][1] else null
        }


### separate chaining

    instead of sorting the value in the table we will store the head to a linked list with those values

    lets create hash table that will store a String

    // in java's implementation they also store the hashvalue on this node
    data class Node(val key: String, val v: Int, var next: Node? = null)

    
    class HT(var size: Int = 100) {

        var array = Array<Node?>(size) { null }
    
        // every java object comes with a hashcode
        //the job of this function should be to map that hashcode onto a set of indeces
        fun hash(s: String): Int {
            return s.chars().sum()
        }
    
        fun insert(key: String, v: Int): Unit {
            val index = hash(key) % size
            if (array[index] == null) {
                array[index] = Node(key, v)
                return
            }
    
            var cur = array[index]
            while(cur.next != null) {
                cur = cur.next
            }
    
            cur.next = Node(key, v)
        }
    
        fun get(s: String): Int? {
            var cur = array[hash(s) % size]
    
            while(cur != null) {
                if (cur.key == s) return cur.v
            }
            return null
        }
    }