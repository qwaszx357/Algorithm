n = int(input())
a = 1

if a > 0:
    for i in range(1,n+1):
        a = a * i
else:
    a = a * 0
print(a)