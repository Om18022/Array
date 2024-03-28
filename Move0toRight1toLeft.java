package Array;

import java.util.Arrays;

public class Move0toRight1toLeft {
    public static void main(String[] args) {
        int arr[] = {1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1};
        int n = arr.length;
        int left = 0;
        int right = n-1;

        while(left <= right){
            if(arr[left]==0){
                left++;
            }else if(arr[right]==1){
                right--;
            }else{
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
