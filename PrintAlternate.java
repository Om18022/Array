package Array;

public class PrintAlternate {
    public static void main(String[] args){
        int arr[] = {10,20,30,40,55};
        int n = arr.length;
        for(int i = 0; i<n; i=i+2){
            System.out.print(arr[i] + " ");
        }
    }
}
