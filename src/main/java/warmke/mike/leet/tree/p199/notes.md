
# Binary Tree Right Side View

start with empty list

fun recur(node)

list.add(node.val)

if right != null recur right
else if left != null recur left


return list

this is assuming the tree sides are the same, and is not correct

--- 

use a BFS

add root to queue

while queue is not empty

for each node on level
    pop value from queue
    add all of its children to the queue

    

same as the last problem
but we only put the last node of each level p102



