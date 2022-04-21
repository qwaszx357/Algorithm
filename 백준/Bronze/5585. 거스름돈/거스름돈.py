n = int(input())
n = 1000 - n
money = [500, 100, 50, 10, 5, 1]
cnt = 0

for i in money:
    if n == 0:
        break
    if i <= n:
        cnt += n // i
        n -= ((n // i) * i)
    elif i > n:
        pass
print(cnt)