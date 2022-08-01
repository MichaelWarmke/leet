

# Number of Islands

we loop over every node in the grid

do a BFS from each node, if one continue else if zero or already visited return
add each node with a 1 into a list

once the DFS is completed, add those cords into a result set


on next nodes 
skip DFS if that node is already in the 