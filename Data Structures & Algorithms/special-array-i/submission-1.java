class Solution {
    public boolean isArraySpecial(int[] nums) {

        for(int i=0; i<nums.length; i++){
            for(int j=1; j<nums.length;j++){
                if(nums[i]%2==0 && nums[j]%2 != 0){
                    return true;
                }
            }
        }
        return false;
    }
}