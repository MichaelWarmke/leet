

$ Rotting Oranges 

you could either do a BFS from every rotten node and assign each health node with a distance to the nearest rotten fruit 

you could also run a BFS from every healthy node to find the closest rotten fruit

this seems this it can memoized

i would probably go with method two -- I don't think this method would actually work

---

multi-source BFS

find all rotten fruit and put them into a queue and run BFS from there

first iteration should count all fresh oranges, and put all the rotten fruit into a queue
