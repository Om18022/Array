package Array;

public class ElementPresentOrNot {
    public static void main(String[] args){
        int arr[] = {10,20,30,40,50};
        int n = arr.length;
        int v = 5000;

        for(int i = 0; i<n; i++){
            if(arr[i] == v){
                System.out.println(v + " = " + "Array Element Is Present.");
                return;
            }
        }
        System.out.println(v + " = " + "Array Element Is Not Present.");
    }

}
