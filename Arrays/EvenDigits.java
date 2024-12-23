public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {1312,1323,4414,51,1421,44};
        int len = arr.length;
        int count = 0;
        for(int i=0; i<len; i++){
            if(digit(arr[i])){
                    count++;
            }
        }
    System.out.println("The total even digits in the array is : "+count);
    }

    public static boolean digit(int num){
        int n=0;

        while (num > 0) {
            num/=10;
            n++;
        }
        if(n%2 == 0 ){
            return true;
        }
        return false;
    }
}
