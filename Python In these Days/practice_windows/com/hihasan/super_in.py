class Person:
    def __init__(self,fname,lname):
        self.fname=fname
        self.lname=lname
    
    def pri(self):
        print (self.fname,self.lname)

class PersonExtra (Person):
    def __init__(self,age,sec):
        super().__init__(fname,lname)
        self.age=age
        self.sec=sec


x=PersonExtra ("Hasan","Mamun")
x.pri()
        