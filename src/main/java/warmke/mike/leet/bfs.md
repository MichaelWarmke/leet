

# Breadth First Search

### iteratively kotlin binary tree

stack.add() adds to last of array queue

    class Node(val i: Int, val left: Node, val right: Node) {}

    class BFS  {
    
        fun traverse(root: Node) {
            val stack: Queue<Node> = LinkedList()
    
            stack.add(root)
            while (stack.isNotEmpty()) {
                val cur = stack.remove()
    
                println(cur.i)
    
                if (cur.left != null) {
                    stack.add(cur.left)
                }

                if (cur.right != null) {
                    stack.add(cur.right)
                }   
            }
        } 
    }

### recursively kotlin binary tree

    class Node(val i: Int, val left: Node, val right: Node) {}

    class BFS  {
    
        fun traverse(root: Node) {
    
            tailrec fun recur(nodes: List<Node>) {
                val mutNodes = nodes.toMutableList()
    
                val cur = mutNodes.removeAt(0)
                println(cur.i)
    
                if (cur.left != null) {
                    mutNodes.add(cur.left)
                }
    
                if (cur.right != null) {
                    mutNodes.add(cur.right)
                }
                recur(mutNodes)
            }
    
            recur(listOf( root))
        }
    }


### iteratively kotlin graph

    class Node(val i: Int, val left: Node, val right: Node) {}

    class BFS  {
    
        fun traverse(root: Node) {
            val stack: Queue<Node> = LinkedList()
    
            stack.add(root)
            while (stack.isNotEmpty()) {
                val cur = stack.remove()
    
                println(cur.i)
    
                if (cur.left != null) {
                    stack.add(cur.left)
                }

                if (cur.right != null) {
                    stack.add(cur.right)
                }   
            }
        } 
    }

### Practice
```kotlin
    class Node(val i: Int, var left: Node?, var right: Node?)

    fun traverse(root: Node?) {
        if (root == null) return
        val queue = ArrayDeque<Node>()
        queue.addLast(root)

        while (queue.isNotEmpty()) {
            val cur = queue.removeFirst()
            print(cur.i)

            if (cur.left != null) { queue.addLast(cur.left!!) }
            if (cur.right != null) { queue.addLast(cur.right!!) }
        }
    }
```

### BFS Java
```java 
class Scratch {
    static class Node {
        int data;
        Node left;
        Node right;
    }

    public void bfs(Node root) {
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        while(!queue.isEmpty()) {
            Node cur = queue.remove();

            System.out.println(cur.data);

            if (cur.left != null) {
                queue.add(cur.left);
            }

            if (cur.right != null) {
                queue.add(cur.right);
            }
        }
    }
}
```