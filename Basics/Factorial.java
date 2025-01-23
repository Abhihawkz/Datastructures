import java.util.*;
public class Factorial {
    
    static int fact(int n){
        int fact=1;
        if(n==0){
            return -1;
        }
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
        System.out.println("Factorial of number is :"+fact(5));
    }
}
