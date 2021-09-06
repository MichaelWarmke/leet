package warmke.mike.leet.p42;

import java.util.LinkedList;

/**
 * seems like most people implemented by using pointers instead of using a Stack/LinkedList Object
 * there method would greatly increase performance.
 */
class Solution {
    public int trap(int[] height) {

        var stack = new LinkedList<Integer>();
        var trappedWater = 0;

        for (int i = 0; i < height.length; i++) {
            while(!stack.isEmpty() && height[stack.getFirst()] < height[i]) {
                var poppedIndex = stack.pop();
                if (stack.isEmpty()) break;
                var h = Math.min(height[stack.getFirst()], height[i]) - height[poppedIndex];
                var length = i - stack.getFirst() - 1;
                trappedWater += h * length;
            }
            stack.add(0, i);
        }

        return trappedWater;
    }
}


