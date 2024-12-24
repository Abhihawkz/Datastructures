import java.util.Arrays;

class ReverseArray{
    static void reverse(int[] nums){
     int start = 0;
     int end = nums.length-1;
     while(start<=end){
        int temp = nums[start];
        nums[start]=nums[end];
        nums[end] = temp;
        start+=1;
        end-=1;
     }   
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}