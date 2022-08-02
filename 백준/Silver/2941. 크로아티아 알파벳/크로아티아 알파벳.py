n = input()
k = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']

for i in k:
    n = n.replace(i,'*')
print(len(n))
