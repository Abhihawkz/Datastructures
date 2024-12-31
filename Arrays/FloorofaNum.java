public class FloorofaNum {
    static int bFloor(int[] arr,int tar){
        int start = 0;
        int end = arr.length -1;
        while (start <= end) {
            int mid = start + end - start / 2;
            if(tar > arr[mid]){
                start = mid + 1;
            }else
            {
                end = mid - 1;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        int[] arr = {12,14,23,35,42,56,68,73,82,88,95};
        int target = 93;
        System.out.println("Floor value of "+target+ " value  in array : "+bFloor(arr,target) );
    }
}
