
# longest substring with repeating chars

start with int buffer, and two pointers l,r

chars = 0
l,r = 0
MaxSubstring = 0

check r value in chars\
if present
remove char value of left pointer, advance l pointer
else
add char value of right pointer, advance r pointer
update MaxSubstring with r - l and MaxSubstring

return MaxSubstring

int buffer only works if all the chars are alphanumeric
we would use a HashSet otherwise