package Array;

public class FindAverage {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        double sum = 0;

        for(int i = 0; i<n; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum Of Array Is : " + " " + sum);
        System.out.println("Average Of Array Is :" + sum/n);
    }

}
