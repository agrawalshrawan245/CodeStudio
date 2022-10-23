public class N03Huffman_coding {   
    
    static huffmannode []arr = new huffmannode[1000000];

    static class huffmannode {
        public int freq;
        public char c;
        public huffmannode ln = null;
        public huffmannode rn = null;
        huffmannode(int freqt, char ct){
            freq = freqt;
            c = ct;
            ln = null;
            rn = null;
        }
    }

    static void add(huffmannode []arr, int place){
        //Propagate min element upwards
        while(place > 0 && arr[place].freq < arr[(place - 1) / 2].freq){
            //swap
            huffmannode temp = arr[place];
            arr[place] = arr[(place - 1) / 2];
            arr[(place - 1) / 2] = temp;

            place = (place - 1) / 2;
        }
    }

    static void arrange_remove(huffmannode []arr, int size, int j){
        int j_min = j;
        //min element place find and propagate up
        if(2 * j + 1 < size && arr[j_min].freq > arr[2 * j + 1].freq) j_min = 2 * j + 1;
        if(2 * j + 2 < size && arr[j_min].freq > arr[2 * j + 2].freq) j_min = 2 * j + 2;
        if(j == j_min) return;

        //swap
        huffmannode temp = arr[j_min];
        arr[j_min] = arr[j];
        arr[j] = temp;

        arrange_remove(arr, size, j_min);
    }

    static void print(huffmannode arr,  String str){
        if(arr==null) return;
        if(arr.c != '_')System.out.print("(" + arr.c + "- " + str + ")   ");
        print(arr.ln, str + '0');
        print(arr.rn, str + '1');
    }

    public static void main(String[] args){
        int size = 6;
        char ch[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
        int freq[] = { 5, 9, 12, 13, 16, 45 }; 
        for(int i = 0; i < size; i++) arr[i] = new huffmannode(freq[i], ch[i]);

        //create heap
        for(int i = 1; i < size;  i++) add(arr, i);

        // create huffman tree
        for(int i = size - 1; i > 0; i--){
            //remove element
            huffmannode temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            arrange_remove(arr, i, 0);

            i--;
            //remove another element
            temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            arrange_remove(arr, i, 0);

            temp = new huffmannode(arr[i].freq + arr[i + 1].freq, '_');
            temp.ln = arr[i];
            temp.rn = arr[i + 1];

            arr[i] = temp;
            add(arr, i);
            i++;
            

        }

        print(arr[0], "");

    }
}

