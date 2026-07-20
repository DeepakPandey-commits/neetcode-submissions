class Solution {
    public boolean check(int[] a) {
        int n=a.length;
        int count=0;
        for(int i=1; i<=n; i++){
            if(a[i-1]>a[i%n]){
                count++;
            }
        }
        if(count <=1){
            return true;
        }else{
            return false;
        }
    }
}