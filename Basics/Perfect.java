static boolean perfect(int num){
    int sum=0;
    for(int i=1;i<num;i++){
        if(num%i==0)
        {
            sum=sum+i;
        }
    }
    if(sum==num){
        return true;
    }
    return false;
}
    public static void main(String[] args) {
        int n=6;
        if(perfect(n)){
        System.out.println("It is perfect number");
    }
    else{
         System.out.println("It is not perfect number");
    }
}
