

# Pacific Atlantic Water Flow

hmm not quite sure on this one

for every node in the grid we are going to run a DFS to find the path to the ocean for all the neighboring nodes

so DFS on each node is not going to be a good solution

---

foreach cell bordering an ocean do a DFS to the higher ground

doing this will construct two sets of node one foreach ocean
node nodes will be returned from the function