class Solution {
    public int removeElement(int[] nums, int val) {
        for(int i=0; i<nums.length; i++){
            if(nums[i] == val){
                nums[i] = nums[i+1];
            }else{
                continue;
            }
        }
        return nums.length-1;
    }
}