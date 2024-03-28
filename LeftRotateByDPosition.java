package Array;

import java.util.Arrays;

public class LeftRotateByDPosition {
    public static void main(String[] args) {
        int arr[] = {2,3,5,6,9};
        int n = arr.length;
        int m = 1;
        int d = m%n;

        for(int i = 1; i<=d; i++){
            int temp = arr[0];
            for(int j = 0; j<n-1; j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
