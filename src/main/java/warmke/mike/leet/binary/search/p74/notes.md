

# Search a 2D Matrix 

start with two pointers r,l

take the midpoint 

check start of midpoint array

if less than update r = m - 1

if greater check the endpoint

if target less than endpoint, do binary search over than array to find target

if target greater than endpoint, update l = m + 1

repeat until target is found

if found return true else false
