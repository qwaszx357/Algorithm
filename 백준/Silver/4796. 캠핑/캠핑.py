i = 0
while True:
    l, p, v = map(int,input().split())
    if l + p + v == 0:
        break
    cnt = 0
    cnt += (v // p) * l
    v -= (v // p) * p
    if v >= l:
        cnt += l
    else:
        cnt += v
    i += 1
    print('Case %d:'%i,cnt)