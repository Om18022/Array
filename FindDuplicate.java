package Array;

public class FindDuplicate {
    public static void main(String[] args) {
        int arr[] = {1,5,3,4,6,2,2};
        int n = 6;
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        n = n*(n+1)/2;
        System.out.println("Duplicate Value In Array Is : "+ (sum-n));
    }
}
