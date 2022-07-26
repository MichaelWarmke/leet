

# Subtree of Another Tree

### This is not Correct

first we need to find the root node of the target subtree in our own tree

then we can traverse the tree checking every node for the correct value

O(n* k) time 

---

Neetcode

we have to evaluate every subtree in the entire tree

if t is null return true
if s id null return false

check if current node is the target subtree

if recur left and recur right

to check current node is target subtree use the algo from p100