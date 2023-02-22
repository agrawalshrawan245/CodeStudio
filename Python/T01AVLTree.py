class TreeNode:
    def __init__(self, val):
        self.val = val
        self.l = None
        self.r = None
        self.h = 1

class AVL_Tree:

    def delete(self, root, key):
        if root == None:
            return None
        elif root.val < key:
            root.r = self.delete(root.r, key)
        elif root.val > key:
            root.l = self.delete(root.l, key)
        else:
            if root.l == None and root.r == None:
                return None
            elif root.l == None:
                return root.r
            elif root.r == None:
                return root.l
            else:
                ln = self.largestNode(root.l)
                root.val = ln.val
                root.l=self.delete(root.l, ln.val)

        root.h = 1 + max(self.gh(root.l), self.gh(root.r))
        bal = self.gh(root.r) - self.gh(root.l)

        if bal > 1 and key > root.r.val:
            root = self.leftRotate(root)
        if bal > 1 and key < root.r.val:
            root.r = self.rightRotate(root.r)
            root = self.leftRotate(root)

        if bal < -1 and key < root.l.val:
            root = self.rightRotate(root)
        if bal < -1 and key > root.l.val:
            root.l = self.leftRotate(root.l)
            root = self.rightRotate(root)

        return root


    def largestNode(self, root):
        if root.r == None:
            return root
        else:
            return self.largestNode(root.r)

    def insert(self, root, key):
        if not root:
            return TreeNode(key)
        elif key < root.val:
            root.l = self.insert(root.l, key)
        else:
            root.r = self.insert(root.r, key)

        root.h = 1 + max(self.gh(root.l), self.gh(root.r))

        bal = self.gh(root.r) - self.gh(root.l)

        if bal > 1 and key > root.r.val:
            root = self.leftRotate(root)
        if bal > 1 and key < root.r.val:
            root.r = self.rightRotate(root.r)
            root = self.leftRotate(root)

        if bal < -1 and key < root.l.val:
            root = self.rightRotate(root)
        if bal < -1 and key > root.l.val:
            root.l = self.leftRotate(root.l)
            root = self.rightRotate(root)

        return root



    def leftRotate(self, z):
        t = z.r
        z.r = t.l
        t.l = z

        z.h=1+max(self.gh(z.l), self.gh(z.r))
        t.h=1+max(self.gh(t.l), self.gh(t.r))

        return t


    def rightRotate(self, z):
        t = z.l
        z.l = t.r
        t.r = z

        z.h=1+max(self.gh(z.l), self.gh(z.r))
        t.h=1+max(self.gh(t.l), self.gh(t.r))

        return t


    def gh(self, root):
        if root:
            return root.h
        else:
            return 0

    def inorder(self, root):
        if root:
            self.inorder(root.l)
            print(root.val)
            self.inorder(root.r)



avl = AVL_Tree()
root = avl.insert(None, 4)
root = avl.insert(root, 7)
root = avl.insert(root, 2)
root = avl.insert(root, 6)
root = avl.insert(root, 5)
root = avl.insert(root, 3)
root = avl.insert(root, 9)
root = avl.insert(root, 10)

root =avl.delete(root, 10)
avl.inorder(root)


# print("------------------------------------")
# avl.inorder(root)


