package Array;

import java.util.Arrays;

public class ReverseArrayInMemory {
    public static void main(String[] args) {
        int arr[] = {1,5,3,4,6,2,2};
        int n = arr.length;
        int left = 0;
        int right = n-1;

        while(left <= right ){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.print(Arrays.toString(arr));
    }
}
