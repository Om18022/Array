package Array;

public class PeintDuplicate {
    public static void main(String[] args) {
        int arr[] = {1,2,5,6,4,8,5,1,6};
        int n = arr.length;

        for(int i =0; i<n-1; i++){
            if(arr[i]<0){
                continue;
            }
            int count = 0;
            for (int j = i+1; j <n ; j++) {
                if(arr[i]==arr[j]){
                    count++;
                    arr[j]=arr[j]*(-1);
                }
            }
            if(count>=1){
                System.out.println(arr[i]);
            }
        }
    }
}
