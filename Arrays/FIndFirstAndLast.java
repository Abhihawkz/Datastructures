import java.util.Arrays;

public class FIndFirstAndLast {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5,5,5,5,5,6,7,12,13,14,19};
        int target = 3;
        int[] ans = {-1,-1};
        ans[0]=find(arr,target,true);
        if(ans[0] !=-1){
            ans[1]=find(arr,target,false);
        }
        System.out.println(Arrays.toString(ans));
    }    

    static int find(int[] arr ,int target, boolean findFirst){
        int start = 0;
        int ans = -1;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            }else if (target < arr[mid]){
                end = mid - 1;
            }else{
                ans = mid;
                if(findFirst){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
