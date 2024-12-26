import java.util.Arrays;

public class Seach2D {
    
    static int[] search(int[][] nums,int target){
        int len = nums.length;
        for(int i=0; i<len; i++){
            for(int j=0; j<nums[i].length; j++){
                if(target == nums[i][j]){
                     return new int[]{i,j};
                }
            }
        }
        
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] arr ={{1,2,4},{12,1214,12,424,52},{1,414,43,535}};
        int target = 52;
        int[] ans = search(arr, target);
        System.out.println("The index of : " + target + " is : "+Arrays.toString(ans));
    }
}
