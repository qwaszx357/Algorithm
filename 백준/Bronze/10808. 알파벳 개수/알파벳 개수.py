n = str(input())
arr = [0] * 26

for i in n:
    arr[ord(i) - ord('a')] += 1
for j in arr:
    print(j, end = ' ')