package Array;

public class InsertUpdateDeleteFindPrint {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int p = 0;

        p = insert(arr,p, 10);
        p = insert(arr,p, 50);
        p = insert(arr,p, 20);
        p = insert(arr,p, 500);
        p = insert(arr,p, 60);
        print1(arr, p);
        find(arr,p,500);
        update(arr, p, 10, 100);
        print1(arr, p);
        p = delete(arr,p,50);
        System.out.println("After deleted value");
        print1(arr,p);
        System.out.println("Size Is : " + " " + size(p));
        System.out.println("P isempty : " + " " + isempty(p));
    }
    private static void print1(int arr[], int p){
        for(int i=0; i<p; i++) {
            System.out.println(arr[i] + " ");
        }
    }
    private static int insert(int arr[], int p, int value){
        if(p == arr.length){
            System.out.println("Array is Full.");
            return p;
        }
        arr[p] = value;
        p++;
        return p;
    }

    private static void find(int arr[], int p, int value){
        for(int i = 0; i<p; i++){
            if(arr[i]==value){
                System.out.println(value + " " +"Array Element Is Present");
                return ;
            }
        }
        System.out.println("Array Element Is Not Present");
    }

    private static void update(int arr[], int p, int oldvalue, int newvalue){
        for(int i = 0; i<p; i++){
            if(arr[i] == oldvalue){
                arr[i] = newvalue;
                return;
            }
        }
    }

    private static int delete(int arr[], int p, int value){
        for(int i = 0; i<p; i++){
            if(arr[i]==value){
                for(int j = i; j<p-1; j++){
                    arr[j] = arr[j+1];
                }p--;
            }
        }return p;
    }

    private static int size(int p){
        return p;
    }

    private static boolean isempty(int p){
        if(p == 0){
            return true;
        }return false;
    }

}
