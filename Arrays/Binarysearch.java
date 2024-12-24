import java.util.Arrays;
import java.util.Scanner;

public class Binarysearch {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {11,13,15,16,18,24,26,82,889};
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter the element to search : ");
        int target = sc.nextInt();
        int ans = bSearch(arr,target);
        System.out.println("The target element is at the position : "+ans);
    }

    static int bSearch(int[] nums,int tar){
        int start = 0;
        int len = nums.length;
        int end = len;
        int count =0;
        while(start <= end){
            System.out.println(count);
            count = count+1;
            int mid =  start + (end-start)/2;
        
            if(tar > nums[mid]){
                start = mid + 1;
            }else if(tar < nums[mid]){
                end = mid - 1;
            }else{
                return mid+1;
            }
        
        }
        return -1;
    }
}
