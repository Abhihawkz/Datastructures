public class DecimaltoBinary {
    static int conversion(int number){
        int rem,answer=0;
        while (number != 0) {
            rem = number % 2;
            number/=2;
            answer = answer * 10 + rem;
        }
        return answer;
    }
    public static void main(String[] args) {
        int num = 13;
        System.out.println(conversion(num));
    }
    
}
