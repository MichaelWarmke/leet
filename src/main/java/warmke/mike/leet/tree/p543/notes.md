

# Diameter of Binary Tree

keep an int for max value

we find the diameter from the bottom

a leaf node has a depth of 0 
null node has a depth of -1

maxDiameter = max(max, 2 + lChild + rChild)

height = 1 + max(right, left)

we also need to return the height of the node from the recur function


