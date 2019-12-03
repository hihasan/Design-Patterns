def square(num):
    return num**3
# square(3)
seq=[1,2,3,4]
value = list(map(square,seq))

for i in value:
    print ('{}'.format(i))

# for i in value:
#     print('The Qbic Value of {} is: {}'.format(seq,i))
#
# for i in seq:
#     print(i)