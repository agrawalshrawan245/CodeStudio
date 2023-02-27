class HuffmanNode:
    def __init__(self, ch, freq):
        self.c=ch
        self.freq=freq
        self.ln=None
        self.rn=None


nodes=[]

def add(node):
    nodes.append(node)
    i = len(nodes) - 1
    while i > 0 and nodes[i].freq < nodes[(i-1)//2].freq:
        temp = nodes[i]
        nodes[i] = nodes[(i-1)//2]
        nodes[(i-1)//2] = temp
        i = (i-1)//2

def remove():
    ret = nodes[0]
    nodes[0] = nodes[-1]
    nodes.pop(-1)
    i = 0
    im = 0
    while i < len(nodes):
        if 2*i+1 < len(nodes) and nodes[2*i+1].freq < nodes[im].freq: im = 2*i+1
        if 2*i+2 < len(nodes) and nodes[2*i+2].freq < nodes[im].freq: im = 2*i+2
        if im == i: break
        temp = nodes[im]
        nodes[im] = nodes[i]
        nodes[i] = temp
        i = im
    return ret


def printme(node, str):
    if node == None:
        return
    printme(node.ln, str+"1")
    if node.c != '-': print("( " + node.c+" - "+str+" )")
    printme(node.rn,str+"0")


arr = [ 'a', 'b', 'c', 'd', 'e', 'f' ]
freq = [ 5, 9, 12, 13, 16, 45 ]

for i in range(len(arr)):
    add(HuffmanNode(arr[i], freq[i]))

while len(nodes) > 1:
    temp1 = remove()
    temp2 = remove()
    temp3 = HuffmanNode('-', temp1.freq+temp2.freq)
    temp3.ln=temp1
    temp3.rn=temp2
    add(temp3)


printme(nodes[0], "")
