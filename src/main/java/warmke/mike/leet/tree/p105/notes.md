

# Construct Binary Tree from Preorder and Inorder Traversal

for preorder the start of the array is always going to be the root

from there we create the root node

we then find that value in the inorder array to determine what should be on the left vs right side

everything to the left side is going into the left side recur
everything to the right side is going into the right side recur

return root

class Solution {

    fun buildTree(preorder: IntArray, inorder: IntArray): Node? {
        if (preorder.isEmpty() || inorder.isEmpty()) return null

        val root = Node(preorder[0])
        val mid = inorder.indexOf(root.value)

        root.left = buildTree(preorder.copyOfRange(1, mid + 1), inorder.copyOfRange(0, mid))
        root.right = buildTree(preorder.copyOfRange(mid + 1, preorder.size -1), inorder.copyOfRange(mid + 1, inorder.size - 1))

        return root
    }
}

---

 seems like if the input is large enough it would be good to get rid of the indexOf operation
 and replace it with a lookup in a hashMap
 
this can also be done without coping the arrays so many times, we can just pass the index around instead 