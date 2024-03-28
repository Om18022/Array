package Array;
import java.util.Arrays;

public class CopyInNewArray {
    public static void main(String[] args) {
        int arr[] = {1,5,3,4,6,2,2};
        int n = arr.length;
        int arr1[] = new int[n];

        for(int i=0; i<n; i++){
            arr1[i]=arr[i];
        }
        System.out.print(Arrays.toString(arr1));
    }

}
