e, s, m = map(int,input().split())
a, b, c = 0, 0, 0

for i in range(8000):
    a += 1
    b += 1
    c += 1
    if a == 16:
        a = 1
    if b == 29:
        b = 1
    if c == 20:
        c = 1
    if a == e and b == s and c == m:
        print(i + 1)
        break