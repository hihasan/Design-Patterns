number=[1,2,3,4]

#print list
print(number)

#Accessing Elements In A List

print(number[0])
print(number[-1])
print(number[-2])
print(number[0]+number[2])

#changing, adding & removing elements

names=["Hasan","Mamun","Al","Nadim"]
names.append("Tasmiah") #When we append an item in the list, it will store in last
print(names)
names.insert(0,"Khan") #while inserting we need to specify the input postion then the stored value
names.insert(0,"Hiumu")
print(names)
print("First Input Value in the List is: " +names[0].title())
print("Last Input Value in the List is : "+names[-1].title())

del names[4]
print(names)

del_name=names.pop()
number.append(del_name)

print("You add delete value in number list: "+int(number))

#delete an item and stored in other list. Need to study firther