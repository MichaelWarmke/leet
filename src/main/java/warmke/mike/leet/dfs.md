

# Depth First Search

### InOrder

    data class Node(val v: Int, var left: Node?, var right: Node?)

    fun inorder(root: Node?): Unit {
        if (root == null) return

        inorder(root.left)
        println(root.v)
        inorder(root.right)
    }

### PreOrder
    
    data class Node(val v: Int, var left: Node?, var right: Node?)

    fun preorder(root: Node?) {
        if (root == null) return

        println(root.v)
        inorder(root.left)
        inorder(root.right)
    }

### PostOrder
    
    data class Node(val v: Int, var left: Node?, var right: Node?)

    fun preorder(root: Node?) {
        if (root == null) return

        inorder(root.left)
        inorder(root.right)
        println(root.v)
    }