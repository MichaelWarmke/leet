

# Count Good Nodes in Binary Tree

we also need to keep a stack of the max element at node

iterative DFS

var total = 0

maxStack = Stack()
nodeStack = Stack()

nodeStack push root
maxStack push root

while nodeStack.isNotEmpty

    if maxStack top <= nodeStack top val total++

    if node.left != null
        nodeStack push node.left
        maxStack push max(node.left, maxStack top)
    else if node.right != null
        nodeStack push node.right
        maxStack push max(node.right, maxStack top)
    else
        nodeStack pop
        maxStack pop
    
---

recursively 

    class Node {
        val value = 0
        val left: Node? = null
        val right: Node? = null
    }

    fun recur(node: Node, max: Int): Int {
    
        val good = if ( node.value >= max ) 1 else 0
    
        val l = if (node.left != null) recur(node.left, max(node.value, max)) else 0
        val r = if (node.right != null) recur(node.right, max(node.value, max)) else 0
    
        return l + r + good
    }

    fun solution(node: Node): Int {
        return recur(node, node.value)
    }
