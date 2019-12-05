class MyClass:
    def __init__(self,num):
        self.num=num

    def rec (self):
        s=self.num
        if self.num>1:
            self.num=self.num*(self.num-1)
            print("The Recursion Value of {} is: {}".format(s,self.num))

        else:
            # print(self.num)
            return self.num

p1=MyClass(5)

p1.rec()