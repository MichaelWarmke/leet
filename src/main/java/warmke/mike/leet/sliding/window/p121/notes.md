
# stock picking window

start with two pointers

l,r = 0

MaxProfit = 0 

advance r 
take max on r - l and update MaxProfit

if r is less than l, advance l to r otherwise advance r until end of array

return MaxProfit