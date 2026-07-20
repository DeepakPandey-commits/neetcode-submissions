class Solution {
    public double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        if(n < 0){
            x = 1/x;
            n = -n;
        }

        double halfPow = myPow(x,n/2);
        double halfPowSq = halfPow*halfPow;
        if(n%2 != 0){
            halfPowSq = x*halfPowSq;
        }
        return halfPowSq;
    }
}
