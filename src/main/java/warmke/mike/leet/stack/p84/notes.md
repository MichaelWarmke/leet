
# Largest Rectangle in Histogram

start with two stacks
one for height and one for position

loop through all the elements

push height
push index

while (heightStack.top >= heightStack.top) 
    max = max(currentMax, currentHeight * (currentIndex - positionStack.top))
    pop height
    pop index