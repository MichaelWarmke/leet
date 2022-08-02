

# Jump Game II

we could start from the end again -- nope

we do a BFS through the array

class Solution {

    fun minJumps(nums: IntArray): Int {
        var result = 0
        var l = 0
        var r = 0

        while (r < nums.size) {
            var maxJump = 0
            for(i in l..r + 1) {
                maxJump = max(maxJump, i + nums[i])
            }

            l = r + 1
            r = maxJump
            result += 1
        }

        return result
    }
}

