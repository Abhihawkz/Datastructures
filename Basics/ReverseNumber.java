public class ReverseNumber {

    static int rev(int num){
        int rem,answer=0;
        while (num != 0) {
            rem = num % 10;
            num/=10;
            answer=answer * 10 + rem;
        }
        return answer;
    }
    public static void main(String[] args) {
        int num = 1234;
        System.out.println(rev(num));
    }
}
