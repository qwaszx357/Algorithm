n = int(input())
cnt = 0


for i in range(n):
    arr = [0] * 26
    word = list(input())
    aa = 0
    for j in word:
        position = ord(j) - ord('a')
        arr[position] += 1
        if arr[position] == 1:
            check_position = position
        elif arr[position] >= 2 and position != check_position:
            aa += 1
    if aa == 0:
        cnt += 1
    '''print('arr =',arr,'aa =',aa,'cnt =', cnt)'''
    arr.clear()

print(cnt)