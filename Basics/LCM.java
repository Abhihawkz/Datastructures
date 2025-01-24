class LCM{
    static int GCD(int n1,int n2){
        while(n1!=0 && n2!=0){
            if(n1>n2)
            {
                n1-=n2;
            }
            else{
                n2-=n1;
            }
        }
        if(n1==0){
            return n2;
        }
        else{
            return n1;
        }
    }
    static int checkLcm(int n1,int n2){
        int gcd=GCD(n1,n2);
        int lcm=(n1*n2)/gcd;
        return lcm;
    }
    public static void main(String[] args) {
        System.out.println("LCM of two numbers is :"+checkLcm(2,3));
        
}
}