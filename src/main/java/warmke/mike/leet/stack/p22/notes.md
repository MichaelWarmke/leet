

# Greater Parenthesis

start with a binary tree

keep count of each of the node with the number of '(' and ')' used so far

first node with value '('

if l count greater than r count
create child nodes with '(' and ')'

if l = r
create only '('

once the max number of '(' node have been created,
fill in the rest of the ')' and add to output array

--- neet version

start with stack and result list

define recursive function with number of left and right paren counts

if left and right equal n combine stack to make output

if left < n
push '('
recur (l + 1, r)
pop

if right < left
push ')'
recur (l, r + 1)
pop

call recur(0,0)
return res
