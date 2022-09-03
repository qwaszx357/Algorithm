n, m = map(int,input().split())
aa, bb = [], []
num = 0
money = 0

for i in range(m):
    a, b = map(int,input().split())
    aa.append(a)
    bb.append(b)

a_min = min(aa)
b_min = min(bb)

if a_min <= b_min * 6:
    num = n // 6
    n = n % 6
    money = num * a_min
    if a_min <= n * b_min:
        money += a_min
    else:
        money += n * b_min
elif a_min > b_min * 6:
    money = b_min * n
print(money)