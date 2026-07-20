class Solution {
    public static long int square(int x){
        return x*x;
    }
    public int mySqrt(int x) {
        int start=0;
        int end=x;
        int result =0;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(square(x) > x){
                end = mid-1;
            }else if(square(x)<x){
                start = mid+1;
                result = mid;
            }else{
                return mid;
            }
        }
        return result;
    }
}