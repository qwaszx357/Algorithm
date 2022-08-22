import sys

t = int(sys.stdin.readline())

for i in range(t):
    arr = [] #신입사원의 점수를 넣을 리스트
    cnt = 1 #선발되는 인원 수
    n = int(sys.stdin.readline())
    for j in range(n):
        a, b = map(int,sys.stdin.readline().split())
        #a = 서류심사 성적 순위, b = 면접 성적 순위
        arr.append([a,b])
    arr.sort()
    minn = arr[0][1]
    
    for j in range(len(arr)):
        if arr[j][1] < minn:
            cnt += 1
            minn = arr[j][1]
        else:
            pass
    print(cnt)