n = input()
n = n.upper()
arr = [0] * 26
a = 0

for i in n:
    position = ord(i) - ord('A')
    arr[position] += 1
maxx = max(arr)

for i in arr:
    if i == maxx:
        a += 1
        
if a >= 2:
    print('?')
else:
    print(chr(arr.index(maxx) + ord('A')))