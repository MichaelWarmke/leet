
#Monotonic Stack
A Monotonic stack is a stack that has all of its elements
arranged according to some type of rule.

All elements must be in decreasing order.
All element must be in increasing order.

If an element comes a long that does not fit into 
that rule then elements need to be popped off of
the stack until the rule holds again.


* range queries in an array problems
* first or last elements useful to problem
* when element popped from the stack it will never
  be used again
  
# Bit Masking 
ref# p2135

When the input strings to a problem can only occur once
and are all lower case letters, a word can be represented 
with a single Int having each bit mapped to one char

mask |= char - 'a'