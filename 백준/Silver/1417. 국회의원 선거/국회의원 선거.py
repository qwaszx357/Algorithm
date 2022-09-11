n = int(input())
arr = []

for i in range(n):
    arr.append(int(input()))

if n == 1:
    print(0)
else:
    a = arr[0]
    del arr[0]
    arr.sort()
    arr.reverse()
    cnt = 0
    
    while max(arr) >= a:
        while a <= arr[0]:
            a += 1
            arr[0] -= 1
            cnt += 1
            arr.sort()
            arr.reverse()
                
            #print('a =', a, '/ arr =', arr, '/ cnt =', cnt)
    print(cnt)