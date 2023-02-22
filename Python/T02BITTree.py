
arr = [2,5,1,3,4,7,8]
len = len(arr)
bit = [0] * (len+1)

def update(x, num):
    x+=1
    while x <= len:
        bit[x] += num
        x += x & (-x)

def getSum(x):
    x+=1
    sum = 0
    while x >= 1:
        sum += bit[x]
        x -= x & (-x)
    return sum

def initialize():
    for i in range(len):
        update(i, arr[i])


initialize()

print(getSum(4))

