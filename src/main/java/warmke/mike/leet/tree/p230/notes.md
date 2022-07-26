

# Kth Smallest Element in a BST


the idea is inorder traversal to get to the kth node

recursively

class Solution {
    var visited = 0

    fun kthSmallest(root: TreeNode?, k: Int): Int {
        recur(node, k)
    }

    fun recur(node: Node?, k: Int): Int {
        if (node == null) return 0

        recur(node.left, k)
        
        visited++
        if (newVisited == k) return node.value

        recur(node.right, newVisited, k)
    }
}

---

iterate  

class Solution {

    fun kthSmallest(root: TreeNode?, k: Int): Int {
        var stack = Stack<TreeNode>()
        var cur = root
        var n = 0 

        stack.push(root)

        while (cur != null && !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur)
                cur = cur.left
            }

            cur = stack.pop()
            n++

            if (n == k) return cur.value
            
            cur = cur.right
        }
        return 0
    }
}