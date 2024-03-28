package Array;

public class StoreReverseInNewArray {
    public static void main(String[] args) {
        int arr[] = {1,5,3,4,6,2,2};
        int n = arr.length;
        int ar1[]= new int[n];
        int j = 0;
        for(int i = n-1; i>=0; i--){
            ar1[j]=arr[i];
            j++;
            System.out.print(ar1[i] + " ");
        }
    }
}
