def rec(num):
    if(num>1):
        num=num*(num-1)
        print(num)
    else:
        num=0
        return 0

rec(5)