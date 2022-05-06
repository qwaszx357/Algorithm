n = int(input())
arr = []

for i in range(n):
    arr.append(int(input()))
    
arr.reverse()
num = arr[0]
cnt = 0

for i in range(1,len(arr)):
    num -= 1
    if arr[i] < num:
        num = arr[i]
    else:
        cnt += arr[i] - num
print(cnt)