package Array;

public class PrintUnique {
    public static void main(String[] args) {
        int arr[] = {1,2,5,6,4,8,5,1,6};
        int n = arr.length;

        for(int i =0; i<n; i++){

            int count = 0;
            for (int j = 0; j <n ; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(arr[i]);
            }
        }
    }
}
