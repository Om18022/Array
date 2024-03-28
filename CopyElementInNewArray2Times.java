package Array;

import java.util.Arrays;

public class CopyElementInNewArray2Times {
    public static void main(String[] args) {
        int arr[] = {10,25,30,45,15};
        int n = arr.length;
        int arrr[] = new int[n*2];

        for(int i=0; i<n; i++){
            arrr[i] = arr[i];
            arrr[i+n] = arr[i];
        }
        System.out.println(Arrays.toString(arrr));
    }
}
