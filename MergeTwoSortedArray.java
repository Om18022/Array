package Array;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int arr[] = {2,3};
        int ar[] = {1,5,6,9,8};
        int n1 = arr.length;
        int n2 = ar.length;
        int a3[] = new int[n1+n2];
        int i = 0, j = 0, k = 0;

        while(i<n1 && j<n2){
            if(arr[i] < ar[j]){
                a3[k] = arr[i];
                i++;
            }else{
                a3[k] = ar[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            a3[k] = arr[i];
            i++;
            k++;
        }
        while(j<n2){
            a3[k] = ar[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(a3));
    }
}
