import java.lang.Math;

public class me {
    Node head;

    Node rightRotate(Node x){
        Node y = x.left;
        Node t2 = y.right;

        x.left = t2;
        y.right = x;

        x.newH();
        y.newH();
        return y;
    }

    Node leftRotate(Node x){
        Node y = x.right;
        Node t2 = y.left;

        x.right = t2;
        y.left = x;

        x.newH();
        y.newH();
        return y;
    }

    

    Node insert(Node node, int key){
        if(node == null) return new Node(key);
        if(key < node.key) node.left = insert(node.left, key);
        else if(key > node.key) node.right = insert(node.right, key);
        else return node;

        node.newH();
        int bal = node.bal(node);

        if(bal > 1 && key > node.right.key){
            return leftRotate(node);
        }
        if(bal > 1 && key < node.right.key){
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
        if(bal < -1 && key < node.left.key){
            return rightRotate(node);
        }
        if(bal < -1 && key > node.left.key){
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        return node;

    }

    Node largestNode(Node n)
    {
        if(n == null) return null;
        while(n.right != null) n = n.right;
        return n;
    }

    Node deleteNode(Node nd, int key)
    {
        if(nd == null) return null;
        if(nd.key > key) nd.left = deleteNode(nd.left, key);
        else if(nd.key < key) nd.right = deleteNode(nd.right, key);
        else
        {
            if(nd.left == null && nd.right == null) return null;
            else if(nd.left == null) return nd.right;
            else if(nd.right == null) return nd.left;
            else{
                Node l_n = largestNode(nd.left);
                nd.key = l_n.key;
                nd.left = deleteNode(nd.left, key);
            }

        }
            nd.newH();
            int balance = nd.bal(nd);
            if(balance < -1 && nd.bal(nd.left) <= 0) return rightRotate(nd);
            if(balance < -1 && nd.bal(nd.left) > 0) {nd.left = leftRotate(nd.left); return rightRotate(nd);}
            if(balance > 1 && nd.bal(nd.right) >= 0) return leftRotate(nd);
            if(balance > 1 && nd.bal(nd.right) < 0) {nd.right = rightRotate(nd.right); return leftRotate(nd);}


            return nd;
        
    }

    void preOrderTraversal(Node node){
        if(node == null) return;
        // System.out.print("(" + node.key + "  " + node.height + ")  ");
        System.out.print(node.key + "  ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }
    public static void main(String[] args){
        me tree = new me();
        // for(int j = 1; j <= 100000; j++){
        //     for(int i = 0; i < j; i++){
        //         tree.head = tree.insert(tree.head, (int)(Math.random()*100000000));
        //     }
        //     int heig = (int)(Math.log(j+1)/Math.log(2) + 1);
        //     if(j < 400 && j%10 == 0)System.out.println(j + "," + heig + "," + tree.head.height);
        //     if(j > 400 && j%500 == 0)System.out.println(j + "," + heig + "," + tree.head.height);
        // }


        tree.head = tree.insert(tree.head, 9);
        tree.head = tree.insert(tree.head, 5);
        tree.head = tree.insert(tree.head, 10);
        tree.head = tree.insert(tree.head, 0);
        tree.head = tree.insert(tree.head, 6);
        tree.head = tree.insert(tree.head, 11);
        tree.head = tree.insert(tree.head, -1);
        tree.head = tree.insert(tree.head, 1);
        tree.head = tree.insert(tree.head, 2);

        tree.preOrderTraversal(tree.head);
        System.out.println();
        tree.head = tree.deleteNode(tree.head, 10);
        tree.preOrderTraversal(tree.head);
    }
}


class Node {
    public int key, height;
    Node left, right;
 
    Node(int d) {
        key = d;
        height = 1;
        left = null;
        right = null;
    }
    int bal(Node x){
        if(x==null)return 0;
        int rh = (x.right == null)?0:x.right.height;
        int lh = (x.left == null)?0:x.left.height;
        return rh - lh;
    }
    void newH() {
        int hl = (left == null) ? 0 : left.height;
        int rl = (right == null) ? 0 : right.height;
        height = 1 + ((hl > rl) ? hl : rl);
    }
}
