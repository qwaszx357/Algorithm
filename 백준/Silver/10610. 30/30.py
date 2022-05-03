n = str(input())
n_list = []
summ = 0

for i in n:
    n_list.append(i)
    summ += int(i)
    
if summ % 3 != 0 or '0' not in n:
    print('-1')
elif '0' in n:
    n_list.sort()
    n_list.reverse()
    print(''.join(n_list))