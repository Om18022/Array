package Array;

public class FindPairGivenSum2Pointer {
    public static void main(String[] args) {

        int arr[] = {5,10,15,20,25,30,35,40,45,50};
        int n = arr.length;
        int value = 30;
        int left = 0;
        int right = n-1;

        while(left <= right){
            if(arr[left] + arr[right] < value){
                left++;
            }else if(arr[left] + arr[right] > value){
                right--;
            }else if(arr[left] + arr[right] == value){
                System.out.println(arr[left] + " " + arr[right]);
                return;
            }
        }
    }
}
