

keep two stacks

one for day temps
one for the index of that temp

fill result array with zero of size of input array

iterating through the list

if stack is empty, add temp to temp stack add index to index stack

while stack is not empty and top of stack is less than current day's temp

pop both stacks
add to result array at the popped values index current day - top of index stack

else push current temp and index to stacks

return res when done iterating