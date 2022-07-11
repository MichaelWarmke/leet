
# Permutation in String

hashmap of s1 chars, count of chars

hashmap of window in s2 chars, count of chars

have two pointers sliding window across s2.
taking out old char of hashmap then inserting the new

between the sliding of the window, compare the sets
if then are equal then return true

if window reaches end and does not match return false 


instead of comparing the two hashmap the whole time
you can keep a hashmap of a-z and count of those in window

you will keep the total number of matches

s1 map has x -> 0 and s2 map has x -> 0 that is a match

if the matches reaches 26 return the current substring