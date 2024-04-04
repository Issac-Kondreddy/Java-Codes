package Heaps;

public class MinHeap {
    private int[] arr;
    private int capacity;
    private int current_heap_size;
    MinHeap(int n) {
        capacity = n;
        arr = new int[capacity];
        current_heap_size = 0;
    }
    private void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private int parent(int index){
        return (index-1)/2;
    }
    private int left(int index){
        return (2*index+1);
    }

    private int right(int index){
        return (2*index+2);
    }

    private boolean insertKey(int key){
        if(current_heap_size==capacity){
            return false;
        }

        int i = current_heap_size;
        arr[i] = key;
        current_heap_size++;

        while(i!=0 && arr[i]<arr[parent(i)]){
            swap(arr, i, parent(i));
            i = parent(i);
        }
        return true;
    }

    private void decreasekey(int key, int new_value){
        arr[key] = new_value;

        while(key!=0 && arr[key]<arr[parent(key)]){
            swap(arr, key, parent(key));
            key = parent(key);
        }
    }

    public int getMin(){
        return arr[0];
    }
    public int extractMin() {
        if (current_heap_size <= 0) {
            return Integer.MAX_VALUE;
        }

        if (current_heap_size == 1) {
            current_heap_size--;
            return arr[0];
        }

        // Store the minimum value,
        // and remove it from heap
        int root = arr[0];

        arr[0] = arr[current_heap_size - 1];
        current_heap_size--;
        Heapify_min(0);

        return root;
    }

    public int removeMin(){
        if(current_heap_size<=0){
            return Integer.MIN_VALUE;
        }
        if(current_heap_size==1){
            current_heap_size--;
            return arr[0];
        }

        int root = arr[0];
        arr[0] =arr[current_heap_size-1];
        Heapify_min(0);
        return root;
    }

    private void Heapify_min(int index){
        int l = left(index);
        int r= right(index);
        int smallest = index;
        if(l<current_heap_size && arr[l]<arr[smallest]){
            smallest=l;
        }
        if(r<smallest && arr[r]<arr[smallest]){
            smallest=r;
        }
        if(smallest!=index){
            swap(arr,index, smallest);
            Heapify_min(smallest);
        }
    }
    public void deletekey(int key){
        decreasekey(key, Integer.MIN_VALUE);
        getMin();
    }

    public void increasekey(int key, int new_value){
        arr[key] = new_value;
        Heapify_min(key);
    }

    public void Changevalueonakey(int key, int new_value){
        if(arr[key] == new_value){
            return;
        }
        if(arr[key]<new_value){
            increasekey(key, new_value);
        }else{
            decreasekey(key, new_value);
        }
    }

    public static void main(String[] args) {
        MinHeap h = new MinHeap(11);
        h.insertKey(3);
        h.insertKey(2);
        h.deletekey(1);
        h.insertKey(15);
        h.insertKey(5);
        h.insertKey(4);
        h.insertKey(45);
        System.out.print(h.extractMin()+ " ");
        System.out.print(h.getMin() + " ");

        h.decreasekey(2, 1);
        System.out.print(h.getMin());

    }
}
