class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int mid = start+(end-start)/2;
        for(int i=0; i<nums.length; i++){
            if(mid == target){
                return mid;
            }else if( mid<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
