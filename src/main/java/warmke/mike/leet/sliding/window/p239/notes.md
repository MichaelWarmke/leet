
# Sliding Window Max 

this is done with a monotonically decreasing deque

two pointers i,j = 0

add first element to stack

for next element if the element on top of the stack is greater than the new\
add it to the queue

if the new value is greater than the top, pop element until this is not true

also pop the queue if the size of the queue goes over the window size

once the two pointer reach their window size, start recording the max on
every loop iteration