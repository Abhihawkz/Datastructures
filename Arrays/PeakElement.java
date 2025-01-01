public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {12,14,16,18,22,24,29,23,21,18,11,4};
        int ans = peak(arr);
        System.out.println(ans);
    }
    static int peak(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end - start)/2;
            System.out.println(mid);
            if(arr[mid] > arr[mid+1]){
               end = mid;
            }else{
                start = mid + 1;
            }
        }
    return arr[end];
    }
}
