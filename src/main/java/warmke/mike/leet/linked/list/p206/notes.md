
# Reverse a linked list

recursively travers to the end of the list
keep a ref to previous node too in the function input

once at the end 
set currentNode.next = Previous.Node

return Node

---

this could also just be implemented with a loop and a stack

iterate through the array and push each node on the stack

then pop through the stack updating each node

---

this can also be done with two pointers

current and previous pointers

c=p=0 
advance p

c.next = p

p=c
