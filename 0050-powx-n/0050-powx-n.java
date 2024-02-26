class Solution {
    public double myPow(double x, int n) {
        if(n>0){
            return Power(x,n);
        }
        else{
            return 1/Power(x,-(long) n);
        }
    }
    private double Power(double base,long n){
        double res=1;
        while(n>0){
            if(n%2==1){
                res=res*base;
            }
            base*=base;
            n/=2;
        }
        return res;
    }
}