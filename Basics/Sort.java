public class Sort {

    static boolean sort(int[] a){
        int n=a.length;
        for(int i=1;i<n;i++){
            if(a[i-1]>a[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int[] a={23,12,45,38,19};
        if(sort(a)){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }
    }
    
}