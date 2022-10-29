cnt = 0

for i in range(8):
    arr = list(input())
    for j in range(len(arr)):
        if i % 2 == 0:
            if j % 2 == 0 and arr[j] == 'F':
                cnt += 1
        else:
            if j % 2 != 0 and arr[j] =='F':
                cnt += 1
print(cnt)