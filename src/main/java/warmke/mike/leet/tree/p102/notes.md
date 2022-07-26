

# Binary Tree Level Order Traversal

Breath first traversal

def emptyList
def emptyQueue

push node
append List.of(node)


while queue.isNotEmpty 

    for each node in current level
        pop node
        append value to level list
        push left and right child
    
    once done add that list to global list

return list after done

O(n) time O(n) space

in a maxed binary tree, the last row contains O(n/2)