

# Binary Search

start with beginning and end index

take the middle of those two and compare to the target

if target is less than the midpoint, move end to midpoint - 1

if target is greater than the midpoint, move the beginning to the midpoint + 1

repeat until target found or midpoint=beginning=end

if at the end no target is found, return -1 instead