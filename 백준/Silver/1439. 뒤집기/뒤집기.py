s = input()
list_0 = list(s.split('1'))
list_1 = list(s.split('0'))

a = len(list_0)
b = len(list_1)

for i in list_0:
    if i == '':
        a -= 1
    else:
        continue
for i in list_1:
    if i == '':
        b -= 1
    else:
        continue
    
if a >= b:
    print(b)
else:
    print(a)