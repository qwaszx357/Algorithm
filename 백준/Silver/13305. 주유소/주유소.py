n = int(input())
a = list(map(int,input().split()))
b = list(map(int,input().split()))
cnt = 0
check_number = b[0]

for i in range(len(b) - 1):
    if check_number > b[i]:
        check_number = b[i]
    elif check_number <= b[i]:
        pass
    cnt += check_number *  a[i]
print(cnt)