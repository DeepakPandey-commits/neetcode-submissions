class Solution {
    public double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        double halfpow = myPow(x,n/2);
        double halfpowSq = halfpow*halfpow;
        if(n%2!=0){
            halfpow = x*halfpowSq;
        }
        return halfpow;
    }
}
