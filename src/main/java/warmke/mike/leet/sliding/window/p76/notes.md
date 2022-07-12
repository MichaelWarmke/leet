
# min window substring

put t into a map of char by count of char\
keep map of current window char, by count of char


keeps vars for minStartIndex, minEndIndex, minWindowSize

two pointers l,r = 0

advance right pointer and only put char into current window map that are in the other map

once all the required chars are in the table, record min vars, and advance l until the condition no longer holds