t = int(input())
a, b, c = 300, 60, 10
aa, bb, cc = 0, 0, 0

aa += t // a
t -= aa * a
bb += t // b
t -= bb * b
cc += t //c
t -= cc *  c

if t % c != 0:
    print(-1)
elif t % c == 0:
    print(aa, bb, cc)