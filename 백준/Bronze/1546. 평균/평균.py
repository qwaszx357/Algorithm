n = int(input())
arr = list(map(int,input().split()))
m = max(arr)
a = 0
for i in range(n):
    arr[i] = arr[i] / m * 100
    a += arr[i]
print(a / n)
