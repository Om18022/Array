package Array;

import java.util.Arrays;

public class MoveOddtoRight1toLeft {
    public static void main(String[] args) {
        int arr[] = {2,4,5,2,44,1,63,2,17,9,6,2};
        int n = arr.length;
        int left = 0;
        int right = n-1;

        while(left <= right){
            if(arr[left]%2 != 0){
                left++;
            }else if(arr[right]%2 == 0){
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
