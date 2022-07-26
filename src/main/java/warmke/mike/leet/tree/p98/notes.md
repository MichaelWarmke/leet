

# Validate Binary Search Tree

do a preorder traversal from current node validate children

also passing the value from the node above it

if we go down the left subtree we need to make sure that all values are less than the root node

recursively  
    
    class Node {
        val value = 0
        val left: Node? = null
        val right: Node? = null
    }
    
    fun recur(node: Node?, lBound: Int?, rBound: Int?): Boolean {
        if (node == null) return true
    
        if (lBound != null && node.value < lBound) return false 
        if (rBound != null && node.value > rBound) return false
    
        return recur(node.left, lBound, node.value) && recur(node.right, node.value, rBound)
    }
    
    class Solution {
        fun isValidBST(root: Node?) {
            recur(root, null, null)
        }
    }

previous implementation did not work

    5
3       7
    4       8

would return true when it should return false

---

