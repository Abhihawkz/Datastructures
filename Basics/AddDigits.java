public class AddDigits {
    public static void main(String[] args) {
        int num = 15;
        while ( num > 9){
            int rem,answer = 0;
            while(num !=0 ){
                rem = num % 10;
                answer =answer + rem;
                num /= 10;
            }

            num = answer;
        }

        System.out.println("The sum of the digits are : "+num);
    }
}
