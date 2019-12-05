class Person:
    def __init__(self,name,age):
        self.name=name
        self.age=age

    def myFun(self):
        print(self.name,self.age)

class Family(Person):
    pass

x=Family("HASAN","36")
x.myFun()