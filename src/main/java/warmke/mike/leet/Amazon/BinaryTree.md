
#### Got Answer on own
- Binary Tree Level Order Traversal
- Binary Tree Right Side View
- Count Good Nodes in Binary Tree
- Kth Smallest Element In a Bst

#### needed help
- Lowest Common Ancestor in Binary Search Tree
- Valid Binary Search Tree
- Construct Binary Tree from Preorder and Inorder Traversal

#### no clue
- 


```java 
class Solution {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public String toString() {
            String s = String.valueOf(val + " ");
            if (left != null) { s += left.toString();}
            if (right != null) {s += right.toString();}
            return s;
        }
    }
    //preorder i +1 will always be a child of i or sibling of i
    //inorder i + 1 will always be right of i

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[0]);
        int mid = -1;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == preorder[0]) {
                mid = i;
                break;
            }
        }

        int[] leftPreorder = Arrays.copyOfRange(preorder, 1, mid + 1);
        int[] leftInorder = Arrays.copyOfRange(inorder, 0, mid);
        root.left = buildTree(leftPreorder, leftInorder);

        int[] rightPreorder = Arrays.copyOfRange(preorder, mid + 1, preorder.length);
        int[] rightInorder = Arrays.copyOfRange(inorder, mid + 1, inorder.length);
        root.right = buildTree(rightPreorder, rightInorder);

        return root;
    }

    public static void main(String[] args) {
        // [3,9,20,15,7]
        Solution solution = new Solution();
        int[] preorder = { 3, 9, 20, 15, 7};
        int[] inorder = { 9, 3, 15, 20, 7};
        System.out.println(solution.buildTree(preorder, inorder));
    }
} 
```

Simple DFS solution
```java
public class Solution {
    int preIdx = 0;
    int inIdx = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return dfs(preorder, inorder, Integer.MAX_VALUE);
    }

    private TreeNode dfs(int[] preorder, int[] inorder, int limit) {
        if (preIdx >= preorder.length) return null;
        if (inorder[inIdx] == limit) {
            inIdx++;
            return null;
        }

        TreeNode root = new TreeNode(preorder[preIdx++]);
        root.left = dfs(preorder, inorder, root.val);
        root.right = dfs(preorder, inorder, limit);
        return root;
    }
}
```