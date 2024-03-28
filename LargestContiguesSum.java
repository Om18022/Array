package Array;

public class LargestContiguesSum {
    public static void main(String[] args) {
        int arr[] = {1,-2,3,-1,4,5,-2,2};
        int n = arr.length;
        int ms = 0;
        int cs = 0;

        for(int i = 0; i<n; i++){
            cs = cs + arr[i];
            if(cs>ms) {
                ms = cs;
            }
            if(cs<0) {
                cs = 0;
            }
        }
        System.out.println(ms);
    }
}
