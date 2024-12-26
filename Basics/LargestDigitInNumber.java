public class LargestDigitInNumber {
    static int largest(int x ){
        int rem,largest=Integer.MIN_VALUE;
        while (x!= 0) {
            rem = x % 10;
            if(rem > largest){
                largest = rem;
            }
            x/=10;
        }
        return largest;
    }
    public static void main(String[] args) {
        int num = 1432873;
        System.out.println(largest(num));
    }
}
