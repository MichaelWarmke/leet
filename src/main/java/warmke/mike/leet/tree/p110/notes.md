

# Balanced Binary Tree

Do a depth first traversal

keep track of the leaves with the lowest and highest height

if the difference ever goes over 1 return false otherwise return true


---

Neet

do a DFS

but from the leaf return isValidTree and height

after calling both subtrees 
check left and right are no more that 1

return bool, 1 + max(left.height, right.height)
