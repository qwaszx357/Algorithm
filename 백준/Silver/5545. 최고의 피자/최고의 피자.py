n = int(input())
a, b = map(int,input().split())
c = int(input())
arr, kk_arr = [], []
m, k, kk = 0, 0, 0
# m = 가격, k = 열량, kk = 1원당 열량

for i in range(n):
    q = int(input())
    arr.append(q)

arr.sort()

for i in range(len(arr)):
    m = a + b * n
    k = c + sum(arr)
    kk = k // m
    kk_arr.append(kk)
    n -= 1
    del arr[0]

kk_arr.append(c // a)
print(max(kk_arr))