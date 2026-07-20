class Solution {
    public int majorityElement(int[] nums) {
        int start = 0 ; 
        int end = nums.length -1;
        int ME = nums[start];
        while(start != end){
            
            int count = 1;
            if(nums[start+1] != ME){
                count --;
                ME = nums[start+1];
                count = count+1;
            }else{
                continue;
            }
        }
        return ME;
    }
}