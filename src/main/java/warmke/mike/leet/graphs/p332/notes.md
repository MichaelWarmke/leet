

# Reconstruct Itinerary

    al but the list is a minHeap
    al list but the children are sorted
    when we traverse we remove the edge of the list

    class Solution {
        fun findItinerary(tickets: List<List<String>>): List<String> {
            val al = tickets.asSequence().groupby { it[0] }
                        .mapValues { key.value.map { list -> list[1]} }
                        .mapValues { key.value.sort() }
                        .toMutableMap()
                
            val result = mutableListOf<String>()

            fun recur(ticket: String): Boolean {
                if (ticket == null && al.isEmpty()) {
                    return true
                }

                if(al[ticket] == null) return false
                
                val temp = al[ticket] 
                return temp.filter { 
                            al[ticket].remove(it)
                            result.add(it)

                            recur(it)
    
                            al[ticket].add(it)
                            result.removeLast()
                    }.isNotEmpty()
            }
            recur("JFK")
            return result
        }
    }