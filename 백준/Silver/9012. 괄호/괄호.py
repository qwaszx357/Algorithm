n = int(input())

for i in range(n):
    a = input()
    arr = []
    cnt = 0
    for j in a:
        arr.append(j)
        if j == '(':
            cnt += 1
        else:
            cnt -= 1
            if cnt < 0:
                print('NO')
                break
    if cnt == 0:
        print('YES')
    elif cnt > 0:
        print('NO')