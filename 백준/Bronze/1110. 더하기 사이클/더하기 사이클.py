number = int(input())

check_number = number

cnt = 1
while True:
    
    second_number = ((number // 10) + (number % 10)) % 10
    number = (number % 10) * 10  + second_number
    if number == check_number:
        break
    cnt += 1

print(cnt)
