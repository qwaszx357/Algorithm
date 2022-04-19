n = int(input())
arr = list(map(int,input().split()))
arr.sort()
time = 0
time_1 = []

for i in arr:
    time += i
    time_1.append(time)
print(sum(time_1))