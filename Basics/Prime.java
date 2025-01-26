class Prime {
    
    static boolean prime(int num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    
    static int calculate(int num){
        int count=0;
     for(int i=2;i<=num;i++){
      if(prime(i)){
          count++;
      }   
     }
     return count;
    }
    public static void main(String[] args) {
        System.out.println("No of prime number between given range is:"+calculate(10));
    }
}