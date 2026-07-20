class Solution {
    public int mySqrt(int x) {
        int start=0;
        int end=x;
        int result =0;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid*mid > x){
                end = mid-1;
            }else if(mid*mid<x){
                start = mid+1;
                result = mid;
            }else{
                return mid;
            }
        }
    }
}