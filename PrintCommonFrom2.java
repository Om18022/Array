package Array;

public class PrintCommonFrom2 {
    public static void main(String[] args){
        int a1[] = {10,20,55,40,5,20};
        int a2[] = {15,10,55,40};
        int n1 = a1.length;
        int n2 = a2.length;

        for(int i = 0; i<n1; i++){
            for(int j = 0; j<n2; j++){
                if(a1[i] == a2[j]){
                    System.out.println(a1[i] + " ");
                }
            }
        }
    }
}
