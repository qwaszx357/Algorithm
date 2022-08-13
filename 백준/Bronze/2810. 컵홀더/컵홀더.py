n = int(input())
a = str(input())

if 'L' not in a:
    pass
elif 'L' in a:
    n -= a.count('L') // 2
    n += 1
print(n)