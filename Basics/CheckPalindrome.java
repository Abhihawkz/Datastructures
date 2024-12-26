import java.util.Scanner;

public class CheckPalindrome {

    static  boolean checkPalindrome(int x){
        int copy = x;
        int rem ,answer = 0;
        while( x != 0){
            rem = x % 10;
            answer = answer * 10 + rem;
            x /= 10;
        }

        return copy == answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Number to check Palindrome");
        int num = sc.nextInt();
        System.out.println(checkPalindrome(num)); 
        
    }
}
