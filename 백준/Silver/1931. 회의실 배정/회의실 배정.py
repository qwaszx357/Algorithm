n = int(input())
arr = []
cnt = 1

for i in range(n):
    a,b = map(int,input().split())
    arr.append([b,a])
arr.sort()
num = arr[0][0]
for i in range(len(arr)):
    if num > arr[i][1]:
        pass
    else:
        cnt += 1
        num = arr[i][0]
        if num == arr[0][0] and i == 0:
            cnt -= 1
print(cnt)