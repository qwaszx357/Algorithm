s = int(input())
cnt = 0
n = 0

for i in range(1, s + 1):
    if s == 1:
        cnt += 1
        break
    else:
        n += i
        cnt += 1
        if n == s:
            break
        elif n > s:
            cnt -= 1
            break
print(cnt)