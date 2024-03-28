package Array;

public class CountSmallerThenCurrent {
    public static void main(String[] args) {
        int arr[] = {10,25,30,45,15};
        int n = arr.length;
        int a=25;

        for(int i = 0; i<n; i++){
            if(a>arr[i]){
                System.out.println(arr[i]);
            }
        }
    }
}
