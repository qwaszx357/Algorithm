n = []
arr = []
arr1 = set(range(1, 10000))

for i in range(1,10000):
    n = i
    for j in str(i):
        n += int(j)
    arr.append(n)
    
arr = set(arr)
arr2 = list(arr1 - arr)
arr2.sort()
for i in arr2:
    print(i)