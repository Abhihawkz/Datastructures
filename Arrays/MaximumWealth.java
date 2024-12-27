public class MaximumWealth {

    static int wealth(int[][] accoutns){
        int largest= Integer.MIN_VALUE;
        for(int i = 0; i<accoutns.length; i++){
            int sum = 0;
        for (int j = 0; j <accoutns[i].length; j++) {
                sum+= accoutns[i][j];
        }
        if(sum > largest){
            largest = sum;
        }
        }
        
        return largest;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,4},{2,2,6},{12,4,5},{1,322,42,245,52,42}};
        System.out.println("The highest wealth : "+wealth(arr));
    }
}
