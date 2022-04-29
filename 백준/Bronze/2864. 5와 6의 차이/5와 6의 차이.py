a, b = map(str,input().split())
a_min = []
a_max = []
b_min = []
b_max = []
a1, a2, b1, b2 = '', '', '', ''

for i in a:
    if i == '5' or i == '6':
        a_min.append('5')
        a_max.append('6')
    else:
        a_min.append(i)
        a_max.append(i)
        
for i in a_min:
    a1 += i
    
for i in a_max:
    a2 += i

for i in b:
    if i == '5' or i == '6':
        b_min.append('5')
        b_max.append('6')
    else:
        b_min.append(i)
        b_max.append(i)

for i in b_min:
    b1 += i
    
for i in b_max:
    b2 += i

minn = int(a1) + int(b1)
maxx = int(a2) + int(b2)

print(minn, maxx)