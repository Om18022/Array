package Array;

public class PrintOddFirstAfterEven {
    public static void main(String[] args){
        int arr[] = {10,20,35,40,55};
        int n = arr.length;
        for(int i = 0; i<n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] + " ");
            }
        }
        for(int i = 0; i<n; i++){
            if(arr[i]%2 == 1){
                System.out.println(arr[i] + " ");
            }
        }
    }
}
