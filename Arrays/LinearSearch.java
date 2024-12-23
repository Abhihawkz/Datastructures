import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class LinearSearch{


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {145,3454,447,5215,600,723,84,951,2345,123,134,51};

        System.out.println("The Reversed array elements is : ");
        swap(arr, 0, 11);
       for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+ " ");
       }
       System.err.println();
       System.err.println();
       System.out.println("The maximum of the array is : "+max(arr,3,8));
       System.err.println();
       System.out.println("The minimum of the array is : "+min(arr,3,8));
    }



    public static int lSearch(int[] nums,int target,int start,int end){
        
       if(nums.length < 0){
        return -1;
       } 

       int len = nums.length;

       for(int i=start; i<=end; i++){
        if(nums[i] == target){
            return i;
        }
       }
       return -1;
    }

    public static void swap(int[] arr, int start,int end){
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }

    public static int max(int[] arr,int start,int end){
        int max = Integer.MIN_VALUE;

        int len = arr.length;

        for(int i = start; i<=end; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int min(int[] arr,int start,int end){
        int min = Integer.MAX_VALUE;
    
        int len = arr.length;
        for (int i = start; i <=end; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    
}