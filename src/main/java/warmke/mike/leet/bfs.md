

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