n, k = map(int,input().split())
a, b, s = 1, 1, 1

for i in range(1,n + 1):
    a *= i

for i in range(1,n - k + 1):
    s *= i

for i in range(1, k + 1):
    b *= i

print(int(a / s / b))