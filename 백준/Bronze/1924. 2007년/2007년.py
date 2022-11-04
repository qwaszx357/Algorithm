a, b = map(int,input().split())
day = ['SUN', 'MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT']
x = 0
m = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
for i in range(1, a):
    if a != 1:
        x += m[i - 1]
    else:
        break
x += b
y = x % 7
print(day[y])