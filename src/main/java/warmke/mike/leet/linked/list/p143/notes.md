

# Reorder List

O(n) time O(n) memory

Put all the nodes into an array then access by index

---

O(n) time O(1) memory

find the first and second half of the list

have two pointers one slow one fast

s += 1
f += 2

once f hits null s will be on the midpoint of the array

then we reverse the second half of the linked list

then you can have two pointers and iterate towards the center