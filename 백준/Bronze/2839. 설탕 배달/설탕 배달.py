n = int(input())
a = n // 5
b = n % 5

for i in range(a, -1, -1):
    if n == 4 or n == 7:
        print(-1)
        break
    if b == 0:
        print(a)
        break
    elif b != 0 and b % 3 == 0:
        print(a + b // 3)
        break
    elif b != 0 and b % 3 != 0:
        a -= 1
        b = (n - 5 * a) % 3
        if b % 3 == 0:
            print(a + ((n - 5 * a) // 3))
            break