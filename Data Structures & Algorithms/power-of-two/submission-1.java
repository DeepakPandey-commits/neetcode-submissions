class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        if(n > 0 && n%2 == 0){
            isPowerofTwo(n/2);
        }
        return false;
    }
}