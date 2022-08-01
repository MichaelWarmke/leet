

# Course Schedule II

this is similar to p207 but instead of returning a bool if it is possible or not
return the path inorder to complete all courses

we will fill the hashmap just like the last one

course by prereqs

then instead of doing a preorder traversal
we will do a post order traversal

adding each course to the list then returning it

Topologial Sort

if any cycles are detected return an empty array

O(edges + nodes)