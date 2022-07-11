
# Encode / Decode Strings

## Encode

We will join all the String together in the list
using the delimiter of s.size() + "#" 

## Decode 

start with empty StringBuilder

loop through ever character of the string.
add char to buffer.
check delimiter is hit.
if hit record size by deleting #.
clear Builder.
append next char according to size.
build builder and add to result list.