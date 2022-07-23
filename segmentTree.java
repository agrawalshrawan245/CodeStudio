public class me {
    static int segment[] = new int[10000];
    static int len;
    void update(int x, int num){
        segment[len + x] = num;
        x = len + x;
        for(int i = x; i > 1; i >>= 1) segment[i >> 1] = segment[i] + segment[i^1]; 
    }
    int getSum(int l, int r){
        int sum = 0;
        for(l += len, r += len; l < r; l >>= 1, r >>= 1){
            if((l & 1) == 1) sum += segment[l++];
            if((r & 1) == 1) sum += segment[--r];
        }
        return sum;
    }
    void initializeTree(int arr[]){
        len = arr.length;
        for(int i = 0; i < len; i++) segment[len + i] = arr[i];
        for(int i = len - 1; i > 0; i--) segment[i] = segment[i << 1] + segment[(i << 1) | 1];
    }
    
    public static void main(String[] args){
        int arr[] = {1,3,2,6,44,7,4,6,8,9,16,13,11};
        me segmentree = new me();
        segmentree.initializeTree(arr);
        System.out.println(segmentree.getSum(3,6));
        segmentree.update(4, 24);
        System.out.println(segmentree.getSum(3,6));
    }
}
// GFG Link :- https://www.geeksforgeeks.org/segment-tree-efficient-implementation/
