
# Car Fleet

have internal fleet object of start position, hours to target

loop through both arrays to create object and sort it by position decreasing order

going to have a stack of this internal fleet object

loop through the sorted array

if stack empty:  
    push currentFleet

if stack is not empty and stack.top.hoursToTarget > currentFleet.hoursToTarget:
    continue
else:
    push currentFleet


at end of array

return stack.size
    