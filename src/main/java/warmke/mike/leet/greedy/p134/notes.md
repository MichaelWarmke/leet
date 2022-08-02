

# Gas Station

this seems like a two pointers problem O(n)

class Solution {

    canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
        var l = 1
        var r = 1
        var tank
    
        while (l != 0) {
            tank += gas[r]
            tank -= cost[r]

            if (l == r) return l

            while (tank < 0 && l < r) {
                tank -=gas[l]
                tank += cost[l]
                l += 1 
            }
            r += 1
        }

        return -1
    }
}


---

Greedy O(n)

class Solution {

    canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
        if (gas.sum() - cost.sum() < 0) return -1
        
        var start = 0
        var tank = 0
        for (i in 0..gas.size -1) {
            tank += (gas[i] - cost[i])
            if (tank < 0) {
                tank = 0
                start = i + 1
            }
        }

        return start
    }
}