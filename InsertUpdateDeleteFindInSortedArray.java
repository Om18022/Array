package Array;

public class InsertUpdateDeleteFindInSortedArray {
    public static void main(String[] args){
        int[] arr = new int[5];
        int p =0;

        p=insert(arr,p,10);
        p=insert(arr,p,5);
        p=insert(arr,p,2);
        p=insert(arr,p,15);
        p=insert(arr,p,50);
        print(arr,p);
        p=delete(arr,p,50);

        update(arr,p,2,10);
        update(arr,p,5,15);
        update(arr,p,10,20);
        update(arr,p,15,25);
        print(arr,p);
    }

    private static void update(int arr[], int p, int oldv, int newv) {
        p=delete(arr,p,oldv);
        p=insert(arr,p,newv);
    }
    private static int delete(int[] arr, int p, int value) {
        for(int i=0; i<p; i++){
            if(arr[i]==value){
                for(int j = i; j<p-1; j++){
                    arr[j] = arr[j+1];
                }
                p--;
            }
        }
        return p;
    }

    private static void print(int[] arr, int p) {
        for(int i = 0; i<p; i++){
            System.out.println(arr[i] + " ");
        }
    }

    private static int insert(int[] arr, int p, int value) {
        if(p==arr.length){
            System.out.println("is full.");
            return 0;
        }
        if(p==0){
            arr[p] = value;
            p++;
            return p;
        }
        int i = p-1;
        while(i>=0 && value<arr[i]){
            arr[i+1] = arr[i];
            i--;
        }
        arr[i+1] = value;
        p++;
        return p;
    }
}
