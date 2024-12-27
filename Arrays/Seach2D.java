import java.util.Arrays;

public class Seach2D {
    
    static int search(int[][] nums){
        int max = Integer.MIN_VALUE;
        int len = nums.length;
        for(int i=0; i<len; i++){
            for(int j=0; j<nums[i].length; j++){
                if(nums[i][j] > max){
                    max = nums[i][j];
                }
            }
        }   
        return max;
    }
    public static void main(String[] args) {
        int[][] arr ={{1,2,4},{12,1214,12,424,52},{1,414,43,535}};
        int ans = search(arr);
        System.out.println("The index of :  is : "+ans);
    }
}
