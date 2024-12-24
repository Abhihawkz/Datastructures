import java.util.Scanner;


public class AddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        while(num > 9){
            int rem,ans=0;
            while (num > 0) {
                rem = num%10;
                ans = ans + rem;
                num/=10;
            }
            num = ans;
        }

        System.out.println("The Sum of the digits is : "+num);

    }
}
