package Array;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {2,1,0,6,2,8,4,3};
        int n = arr.length;

        for(int i = 1; i<n; i++){
            int temp = arr[i];
            int j;
            for(j = i-1; j>=0 && arr[j]> temp; j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
