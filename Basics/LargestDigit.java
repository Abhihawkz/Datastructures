import java.util.Scanner;

class LargestDigit {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number to find the largest in it");
    int num = sc.nextInt();
    int rem,largest=Integer.MIN_VALUE;
    while (num != 0) {
    rem = num%10;
    num/=10;
        if(rem > largest) {
            largest = rem;
        }
    }

    System.out.println("largest digit is : "+largest);
}    
}