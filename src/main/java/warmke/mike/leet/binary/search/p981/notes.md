

# Time Based Key-Value Store

    data class TimedValue(val v: String, val t: Int) {}    

    class TimeMap() {

        val values = mutableMapOf<String, MutableList<TimedValues>>()
    
        fun set(key: String, value: String, timestamp: Int) {
            val entry = values[key]
            if (entry == null) {
                values[key] = mutableListOf<TimedValues>(TimedValue(value, timestamp))
            } else {
                entry.value.add(TimedValue(value,timestamp))
            }
        }
    
        // for O(n) look up time
        fun get(key: String, timestamp: Int): String {
            values[key].forEachReversed {
                if (it.t <= timestamp) return it.v
            }
            return ""
        }

        fun get(key: String, timestamp: Int): String {
            val v = values[key]
            var l = 0
            var r = v.size -1
            var result = ""

            while (l <= r) {
                val mp = (r + l) / 2

                if (timestamp < v[mp].t) {
                    res = v[mp].v
                    r = mp - 1
                } else {
                    l = mp + 1
                }
            }
            
            return result
        }

        
    
    }