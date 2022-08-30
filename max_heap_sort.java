public class me {    

    public static void main(String[] args){
        int arr[] = {0,3,2,6,44,7,4,6,8,9,16,13,11};
        int len = arr.length;
        
        //Goal is to create max heap and then do a sort of increasing order.
        //Heapfiy
        for(int i = 1; i < len; i++){
            //Simple process is in max heap maximum number from the bottom moves up, till it finds a suitable place.
            int j = i;
            while(j > 0 && arr[j] > arr[(j-1)/2]) {
                arr[j] = arr[j] + arr[(j - 1) / 2] - (arr[(j - 1) / 2] = arr[j]);
                j = (j - 1) / 2;
            }
        }

        //sort
        for(int i = len - 1; i > 0; i--){
            //Swipe first and last number of heap, so that maximum number goes to the last.
            arr[0]=arr[0]+arr[i]-(arr[i] = arr[0]);
            int j = 0;
            int k = 0;
            // Arrange the top node as it is not maximum now, till it finds suitable place.
            // In max hip small number moves down until needed.
            
            // Here you need to find the max number among node and it's two child.
            // And then change place of node with the new node.
            while(j < i){
                if(2 * j + 1 < i && arr[k] < arr[2 * j + 1]) k = 2 * j + 1;
                if(2 * j + 2 < i && arr[k] < arr[2 * j + 2]) k = 2 * j + 2;
                if(j == k) break;
                arr[k]=arr[k]+arr[j]-(arr[j] = arr[k]);
                j = k;
            }
        }


        for(int i = 0; i < len; i ++) System.out.print(arr[i] + "  ");
        // Result:- 0  2  3  4  6  6  7  8  9  11  13  16  44
    }
}
