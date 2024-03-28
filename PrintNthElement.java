package Array;

public class PrintNthElement {
    public static void main(String[] args){
        int arr[] = {10,20,30,40,55};
        int n = arr.length;
        int a = 3;
        for (int i = 0; i<n; i++){
            System.out.println("Nth Value In Array is :" + arr[a-1]);
            return;
        }
    }

}
