class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int fp = 0;
        int np =fp+1;
        while(np!=nums.length-1){
            if(nums[fp] == nums[np]){
                
                fp++;
                np++;
                return true;
            }
        }
        return false;
    }
}