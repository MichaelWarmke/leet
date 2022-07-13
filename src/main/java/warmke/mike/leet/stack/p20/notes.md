

# Valid Parenthesis 

we are going to use a stack for all of symbols

iterating through the list,
when we see a left symbol we push it on the stack

when we see a right symbol we pop from the stack. 
if the stack is empty while trying to pop from it, return false

if there are any symbols left in the stack at the end of interation, return false

otherwise return true
