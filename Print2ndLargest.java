package Array;

public class Print2ndLargest {
    public static void main(String[] args){
        int a1[] = {10,20,55,40,5,20};
        int n = a1.length;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i = 0; i<n; i++){
            if(a1[i]>max1){
                max2 = max1;
                max1 = a1[i];
            }else if(a1[i]>max2){
                max2 = a1[i];
            }
        }
        System.out.println(max2 + " ");
    }
}
