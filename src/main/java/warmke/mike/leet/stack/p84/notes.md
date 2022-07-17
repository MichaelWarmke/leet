
# Largest Rectangle in Histogram

the thought here is to keep a monotonic stack that has heights that are always increasing

start with two stacks
one for height and one for position

loop through all the elements

push height
push index

while (heightStack.top < heightStack.top - 1) 
    max = max(currentMax, heightStack.top * (positionStack.top - positionStack.top - 1))
    pop height
    pop index


at the end of iteration

loop through all the elements left in the stack in reverse order

calculate the areas and update the max 
