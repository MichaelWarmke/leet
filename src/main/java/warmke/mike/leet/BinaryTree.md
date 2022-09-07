

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