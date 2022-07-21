

# Add Two Numbers

two pointers

p1,p2

newHead = Node()
curNode = newHead

add the numbers together

carry=0
newVal = v1 + v2 + carry
carry = newVal / 10
newVal = newVal % 10

curNode = Node(newVal)

advance all pointers

return newHead