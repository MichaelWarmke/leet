
# 3 num sum

sort the input array nlogn

three pointers \
i \
j \
k 

one pointer will act as the target
and will begin at index zero

we then do a two sum across the rest of the numbers

for duplicates, we will only evaluate a single target number once.

so if there are two 3 in the input array
we will ignore the second one when choose next target

time O(n^2)
