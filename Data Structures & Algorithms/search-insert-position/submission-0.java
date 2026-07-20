class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target == mid){
                return mid;
            }else if(target > mid){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return start;
    }
}