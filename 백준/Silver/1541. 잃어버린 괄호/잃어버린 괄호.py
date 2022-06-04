n = list(input().split('-'))
cnt = 0

for i in n[0].split('+'):
    cnt += int(i)
del n[0]

for i in n:
    for j in i.split('+'):
        cnt -= int(j)

print(cnt)
