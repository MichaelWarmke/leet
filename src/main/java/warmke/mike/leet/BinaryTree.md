

# Binary Tree

### Invert Binary Tree p226

    data class TreeNode(val v: Int, var right: TreeNode?, var left: TreeNode?)

    fun reverse(val root: TreeNode?): Unit {
        if (root == null) return null

        val temp = root.right
        root.right = root.left
        root.left = temp

        reverse(root.left)
        reverse(root.right)
    }

    fun reverse(val root: TreeNode?): TreeNode? {
        if (root == null) return null

        return TreeNode(root.v, reverse(root.right), reverse(root.left))
    }

does this work with either BFS or DFS? yes as long as it visits every mode once 
this is a depth first traversal

### Java Impl

```java 
class Solution {
    static class Node {
        Node left;
        Node right;
    }

    public void reverse(Node root) {
        if (root == null) return;
        
        Node tmp = root.right;
        root.right = root.left;
        root.left = tmp;
        
        reverse(root.left);
        reverse(root.right);
    }
    
}
```