

# Binary Search

    this can be use on arrays that are in sorted order

    fun search(val array: IntArray, val target: Int): Boolean {
        
        var l = 0
        var r = array.size -1

        while (l < r) {
            val mp = ((r - l) + l) / 2

            if (target > array[mp]) {
                l = mp + 1
            } else {
                r = mp - 1
            }
        }
        return l == target
    } 

 1 2 3 4 5 
       l r
 
### Java Binary Search 
```java
class Solution {

    public boolean search(int[] ints, int target) {
        int r = 0;
        int l = ints.length - 1;   
        while (l < r) {
            int midpoint = ((r - l) + l) / 2;
            
            if (target > midpoint) {
                l = midpoint + 1;
            } else {
                r = midpoint - 1;
            }
        }
        return l == target;
    }
}
```
t 5
1 2 3 4 5 6 7 8
l             r
        l     r
        lr      