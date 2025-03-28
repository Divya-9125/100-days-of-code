class Solution {
    public double myPow(double x, int n) {
        return pow(x,(long)n);   //typecasting
    }
    private double pow(double x,long n){
        if(n==0)    return 1;    //Base case: if not,Throws error on recursive call
        if(n<0) return 1.0/pow(x,-n);
        if(n%2==0)  return pow(x*x,n/2);
        else    return x*pow(x*x,(n-1)/2);
    }
}
