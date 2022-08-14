n, k = map(int,input().split())
a = str(input())
arr = []
cnt = 0

for i in a:
    arr.append(i)

for i in range(n):
    if arr[i] == 'H':
        for j in range(i,i + k + 1):
            if j >= n:
                break
            else:
                if arr[j] == 'P' and j <= n:
                    cnt += 1
                    arr[i] = 'A'
                    arr[j] = 'A'
                    break
                elif arr[j] != 'p':
                    continue
    elif arr[i] == 'P':
        for j in range(i,i + k + 1):
            if j >= n:
                break
            else:
                if arr[j] == 'H' and j <= n:
                    cnt += 1
                    arr[i] = 'A'
                    arr[j] = 'A'
                    break
                else:
                    continue
    elif arr[i] == 'A':
        continue
print(cnt)
