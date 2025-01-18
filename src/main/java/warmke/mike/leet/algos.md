
# Breadth-first search
Search all child elements in order of depth in tree
1 -
2 2 -
3 3 3 - 

# Depth-first search
Search all child elements in order of depth
1 2 3 - 3 - 2 3

# Sort

sort on collections O(nlogn) using quicksort/merge/heap

### Heapsort

divides array into two sections sorted and unsorted
it finds the highest value and puts it into the sorted section

all the unsorted values are in a heap, and it uses this to 

### TimSort

a mixture of MergeSort and Binary Insertion Sort
it's adaptive in that it handles input data differently based on some factors 

Small input sizes below 64 elements uses binary linear search and binary insertion sort

this is a stable sort in that elements that are equal are not moved around by this search

### QuickSort

#### Time Complexity Average O(nlogn)  Worst O(n^2)

a pivot is selected, then the array it sorted until 3 conditions are true
all element to the right are larger than the pivot
all element to the left are less than the pivot
correct position in final sorted array

choose a 'random' pivot in the array, and move it to the end
two pointers one starting at right and the other starting at the left
l,r

l finds first number larger than pivot
r finds first number less than pivot

those values are then swapped

continue this until r < l

then swap l with pivot

when selecting the pivot we want the value to be as close to the median as possible \
so than we can as close to the infinite series of 1/2n n = 1..INF

median of three i = 0, size /2, size -1 are taken and the middle of those three are the pivot

# Insert

    hashmap O(1) worst O(n)
    array O(n)
    stack/queue/linkedList/doubleLinkedList O(1)

    binary search tree O(log n) worst O(n)
    b tree O(log n)
    min/max heap O(logn) worst case O(1) average

# Delete

    hashmap O(1) worst O(n)
    array O(n)
    stack/queue/linkedList/doubleLinkedList O(1)

    binary search tree O(log n) worst O(n)
    b tree O(log n)
    min/max heap O(logn) worst case O(logn) average

# Look up Access

    hashmap O(1) worst O(n)
    array O(1)
    stack/queue/linkedList/doubleLinkedList O(n)

    binary search tree O(log n) worst O(n)
    b tree O(log n)

    min/max heap O(1) for min/max value
    

# Search

    array O(n)
    stack/queue/linkedList/doubleLinkedList O(n)

    binary search tree O(log n) worst O(n)
    b tree O(log n)

# Decision Tree

making a decision tree time complexity n^k 
n = number of decisions
k = depth of the tree

# UnionFind

# adjacent list
    a tool to help traverse graphs 
    key is the node
    value is a list of its children

# min spanning tree

    min cost to connect a graph without cycles 

# prim's algo

    
# total edges in a graph
    would be equal to the number of nodes squared
    v = n ^ 2

# Djikstra - shortest path in graph

    overall O(ElogV)
    unreduced O(ElogV ^ 2)

# Bellman - ford
