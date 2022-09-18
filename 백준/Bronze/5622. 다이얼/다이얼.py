n = input()
arr = []
time = 0

for i in n:
    arr.append(i)
for j in range(len(arr)):
    if arr[j] == 'A' or arr[j] == 'B' or arr[j] == 'C':
        time += 3
    elif arr[j] == 'D' or arr[j] == 'E' or arr[j] == 'F':
        time += 4
    elif arr[j] == 'G' or arr[j] == 'H' or arr[j] == 'I':
        time += 5
    elif arr[j] == 'J' or arr[j] == 'K' or arr[j] == 'L':
        time += 6
    elif arr[j] == 'M' or arr[j] == 'N' or arr[j] == 'O':
        time += 7
    elif arr[j] == 'P' or arr[j] == 'Q' or arr[j] == 'R' or arr[j] == 'S':
        time += 8
    elif arr[j] == 'T' or arr[j] == 'U' or arr[j] == 'V':
        time += 9
    elif arr[j] == 'W' or arr[j] == 'X' or arr[j] == 'Y' or arr[j] == 'Z':
        time += 10
print(time)