

start with two pointers

t = head list 1
b = head list 2

one next pointer for moving things around\
tmp
    
    if t.value == b.value || t.value < b.value || b.next == null
        tmp = t
        t = t.next
        tmp.next = b

    else if b.value < t.value || t.next = null
        tmp = b
        b = b.next
        tmp.next = t
