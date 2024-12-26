public class Largest {
    public static void main(String[] args) {
        int a = 10;
        int b = 143;
        int c =1;
        int largest = a;
        if(b > largest){
            largest = b; 
        }
        if(c > largest){
            largest = c;
        }
        System.out.println("Maximum no : "+largest);
    }
}
