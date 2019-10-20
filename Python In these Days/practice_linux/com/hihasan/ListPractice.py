#list-variavle
name=["Hasan","Mamun","Nadim"]
name2=["Rony","Rasel"]
number=[1,4,6,2,3,2,90,23]


print(name[0])
del_value=name.pop()
print(name)
print("Pop value: " +del_value)
print(name2)
name2.append(del_value)
print(name2)
name2.sort()
print(name2)
number.sort()
print(number)
# number.sort(reverse=true)
# print(number)

#Length of the list
print("Length of the list: "+str(len(number)))
