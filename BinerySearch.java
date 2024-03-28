package Array;

public class BinerySearch {
    public static void main(String[] args) {

        int arr[] = {5,10,15,20,25,30,35,40,45,50};
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int value = 100;

        while(left <= right){
            int mid = (left + right) /2;
            if(arr[mid] == value){
                System.out.println("Value Is Present.");
                return;
            }else if(value > arr[mid]){
                left = mid + 1;;
            }else{
                right = mid -1;
            }
        }
        System.out.println("Value Is Not Present.");
    }
}
