import java.util.Scanner;

public class BinarytoDecimal {
    static int conversion(int number){
        int rem,mul=1,answer=0;
        while(number != 0){
            rem = number % 10;
            number /=10;
            answer = rem * mul + answer;
            mul = mul * 2;
        }
        return answer;
    }
    public static void main(String[] args) {
        int num = 1101;
        System.out.println(conversion(num));
    }
}
