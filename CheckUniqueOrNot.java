package Array;

public class CheckUniqueOrNot {
    public static void main(String[] args) {
        int arr[] = {1,2,5,6,4,8,5,1,6};
        int n = arr.length;
        int a = 5;
        int count = 0;

        for(int i =0; i<n; i++){
            if(arr[i]==a){
                count++;
            }
        }
        if(count==1){
            System.out.println("is Unique");
        }else{
            System.out.println("Not Unique");
        }
    }
}
