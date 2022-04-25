n = int(input())
arr = []
arr1 = []

for i in range(n):
    arr.append(int(input()))
arr.sort()
for j in range(len(arr)):
    arr1.append(arr[j] * (n - j))

print(max(arr1))