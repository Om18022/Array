package Array;

public class FindLargest {
    public static void main(String[] args){
        int arr[] = {10,20,355,40,55};
        int n = arr.length;
        int max = arr[0];

        for(int i = 0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
