public class me {
    static int bit[] = new int[10000];
    static int len;
    void update(int x, int num){
        x++;
        while(x <= len){
            bit[x] += num;
            x += x & (-x);
        }
    }
    int getSum(int x){
        int sum = 0;
        x++;
        while(x >= 1){
            sum += bit[x];
            x -= x & (-x);
        }
        return sum;
    }
    void initializeBIT(int arr[]){
        for(int i = 0; i < 10000; i++) bit[i] = 0;

        len = arr.length;
        for(int i = 0; i < len; i++) update(i, arr[i]);
        
    }
    public static void main(String[] args){
        int arr[] = {1,3,2,6,44,7,4,6,8,9,16,13,11};
        me bitme = new me();
        bitme.initializeBIT(arr);
        System.out.println(bitme.getSum(4));
    }
}
