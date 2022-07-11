
# Longest Repeating Char Replacement

two pointers
l, r = 0
MaxWindow = 0

replacements = k

have a hashmap of char by char count

put r value into map
advance r pointer

if the window is not valid then
advance the l pointer

not valid being currentWindow - max(map.values()) <= k

update max window with max of itself and current window size

return MaxWindow