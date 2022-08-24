n = int(input())
arr = []

for i in range(n):
    a, b = map(int,input().split())
    arr.append([a,b])
arr.sort()
time = sum(arr[0])

for i in range(1,n):
    if arr[i][0] >= time:
        time = sum(arr[i])
    else:
        time += arr[i][1]
print(time)