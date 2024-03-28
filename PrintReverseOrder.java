package Array;

public class PrintReverseOrder {
    public static void main(String[] args){
        int arr[] = {10,20,30,40,55};
        int n = arr.length;
        for(int i = n-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
