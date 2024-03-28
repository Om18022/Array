package Array;

public class CountOddEven {
    public static void main(String[] args){
        int arr[] = {10,20,30,40,55};
        int n = arr.length;
        int ecount = 0, ocount = 0;

        for (int i = 0; i<n; i++) {
            if (arr[i] % 2 == 0) {
                ecount++;
            } else {
                ocount++;
            }
        }
        System.out.println("Total Even Is : " + ecount);
        System.out.println("Total Odd Is : " + ocount);
    }
}
