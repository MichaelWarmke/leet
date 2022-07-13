

# Min Stack

keep two stacks

one will function as normal

the other one will hold all the min values at the time the value was pushed

push should push the value given to the normal stack
and check to see if it is less than the current min

if it is push the new value, otherwise push the min value again

when popping, pop a value from both stacks

get min will just top the min stack