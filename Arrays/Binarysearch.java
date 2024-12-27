public class Binarysearch {

    static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        boolean isAsc = nums[start] < nums[end];

        if (isAsc) {
            while (start <= end) {
                int mid = start + end - start / 2;
                if (target == nums[mid]) {
                    return mid;
                }
                if (target > nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        } else {
            while (start <= end) {
                int mid = start + end - start / 2;
                if (target == nums[mid]) {
                    return mid;
                }
                if (target < nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 2;
        System.out.println("Located at : " + binarySearch(arr, target));
        reverse(arr);
        System.out.println("Located at : " + binarySearch(arr, target));
    }
}