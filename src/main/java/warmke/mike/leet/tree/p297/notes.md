

# Serialize and Deserialize Binary Tree
    
    Time O(n) for both functions

    data class TreeNode(val v: Int, var left: TreeNode?, var right: TreeNode?) {}

    class Codec() {
        val token = ":"
    
        // Encodes a URL to a shortened URL.
        fun serialize(root: TreeNode?): String {
            val buffer = StringBuilder()

            fun recur(node: TreeNode?) {
                if (node == null) {
                    buffer.add(token)
                    return
                }

                buffer.add(node.v)
                buffer.add(token)
                recur(node.left)
                recur(node.right)
            }
            recur(root)
            return buffer.toString()
        }
    
        // Decodes your encoded data to tree.
        fun deserialize(data: String): TreeNode? {
            if (data.isEmpty() || data.equals(":")) return null
            val pdata = data.split(":")

            fun recur(i: Int): TreeNode? {
                if(chars[i] == "") return null

                return TreeNode(chars[i], recur(i + 1), recur(i + 2))
            }

            return recur(0)
        }
    }