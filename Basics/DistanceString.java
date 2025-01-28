

public class DistanceString{


    static int distance(String[] s,String a,String b){
        int d1 = -1,d2 = -1;
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<s.length;i++){
            if(s[i] == a){
                d1=i;
            }
            if(s[i] == b){
                d2=i;
            }
            if(d1 != -1 && d2!= -1){
                ans = Math.min(ans,Math.abs(d1 - d2));
            }
        }
        return ans;
    }

    public static void main(String args[]){
        String[] S
        = { "the", "quick", "brown", "fox", "snake" };
 
    String word1 = "quick", word2 = "snake";
 
    System.out.println(distance(S, word1, word2));

        
    }
}