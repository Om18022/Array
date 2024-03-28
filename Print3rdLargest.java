package Array;

public class Print3rdLargest {
    public static void main(String[] args){
        int a1[] = {50,10,55,65,70,20,80};
        int n = a1.length;

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            if(a1[i]>max1){
                max3 = max2;
                max2 = max1;
                max1 = a1[i];
            }else if(a1[i]>max2){
                max3 = max2;
                max2 = a1[i];
            }
            else if(a1[i]>max3){
                max3 = a1[i];
            }
        }
        System.out.println(max3 + " ");
    }
}
