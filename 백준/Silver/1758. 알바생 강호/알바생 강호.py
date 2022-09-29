n = int(input())
arr = []
money = 0
num = 0

for i in range(n):
    a = int(input())
    arr.append(a)
arr.sort()
arr.reverse()

for j in range(len(arr)):
    num = arr[j] - j
    if num <= 0:
        continue
    else:
        money += num
print(money)