public class Binarysearch {

    static int binarySearch(int[] nums,int target){
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + end-start /2;
            if( target > nums[mid]){
                start = mid + 1;
            }else if(target < nums[mid]){
                end = mid - 1;
            }else{
                return mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 2;
        System.out.println("Located at : "+binarySearch(arr,target));
    }
}