

# Remove Nth Node From End of List

start with two pointers r,l

iterating through the list

start with advancing r until it is n steps ahead of l

then advance both until the end of the list is reached

once the end is reached

r == l + n

l.next = r
