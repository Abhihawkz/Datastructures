import java.util.Scanner;

public class LeapYear { 

    static boolean checkLeapYear(int x){
        if(x % 400 == 0){
            return true;
        }else if ( x % 4 == 0 && x % 100 != 0){
            return true;
        }else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a yaer : ");
        int year = sc.nextInt();
        System.out.println(checkLeapYear(year));
    }
    
}
