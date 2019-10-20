# names=["Hasan","Al","Mamun","Nadim","Tasmiah","Khan","Himu"]
# number=[1,2,3,4,5,6,7,8,9]
# for name in names:
#     print(name)
#
# print("\nEnd")

#range
for number in range(1,6):
    print(str(number)+", Position")

# Here I get number and stored in a range
# and print the range using for loop
number=list(range(1,5))
for n in number:
    print(n)
print("\n")

#print number. In here first value in range is staring point
#second one is the ending point
#third one is increment value.
#what happens in here 2+3=5, 5+3=8...
number=list(range(2,15,3))
for n in number:
    print(n);