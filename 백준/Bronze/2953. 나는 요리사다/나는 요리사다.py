arr = []

for i in range(5):
    a, b, c, d = map(int,input().split())
    num = a + b + c + d
    arr.append(num)
print(arr.index(max(arr)) + 1, max(arr))