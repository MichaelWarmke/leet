

# Koko Eating Bananas

we are going to do a binary search of the values 1 - max(piles)

we will then evaluate the k value by seeing how many hours it took to eat all the bananas at that rate

actualH
for pile in piles
    actualH += Math.ceiling(pile / k)

if h is less than the targetH, move r to midpoint - 1

if h is greater than the targetH, move l to midpoint + 1

repeat until r < l

return than value k

total time complexity

nlogm

n is the length of the array
m is the pile with the most bananas