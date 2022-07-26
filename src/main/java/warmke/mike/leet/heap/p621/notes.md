

# Task Scheduler

brute force
keep the tasks in a maxHeap by the number of 
    
O(n) for inserting everything into the heap
O(n) for going through each task
O(1) looking at maxHeap element
O(1) adding and popping from Queue

Overall O(n)

    class Task(val c: Char, var count: Int, var cooldown: Int): Comparable<Task> {
    
        override fun compareTo(other: Task): Int {
            return this.count - other.count
        }
    }
    
    class Solution {
        fun leastInterval(task: CharArray, n: Int): Int {
        val tasks = PriorityQueue<Task>(Comparator.reverseOrder())
        tasks.addAll(task.groupBy { it }.mapValues { it.value.size }.map { Task(it.key, it.value, 0) })
        val cooldownQueue: Queue<Task> = LinkedList()
        var cycles = 0
    
            while (tasks.isNotEmpty() && cooldownQueue.isNotEmpty()) {
                cycles += 1
    
                var curTask = tasks.remove()
                if (curTask.count > 1) {
                    curTask.count = curTask.count - 1
    
                    if (n == 0) {
                        tasks.add(curTask)
                        continue
                    }
    
                    curTask.cooldown = cycles + n
                    cooldownQueue.add(curTask)
    
                    if (cooldownQueue.peek().cooldown == cycles) {
                        tasks.add(cooldownQueue.remove())
                    }
                }
    
            }
    
            return cycles
        }
    
    }