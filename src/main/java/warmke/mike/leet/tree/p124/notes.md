

# Binary Tree Maximum Path Sum

    data class TreeNode(val v: Int, var left: TreeNode?, var right: TreeNode?) {}

    class Solution {
        fun maxPathSum(root: TreeNode?): Int {
            var max = 0 
        
            fun recur(node: TreeNode?): Int {
                if (node == null) return 0

                val maxLeft = max(recur(node.left), 0)
                val maxRight = max(recur(node.right), 0)

                max = max(max, node.v + maxLeft + maxRight)
                return node.v + max(maxLeft, maxRight)
            }

            recur(root)
            return max
        }
    }