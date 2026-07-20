class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int i =0;
        fot(int j=0; j<nums.length; j++){
            if(nums[j]%2 == 0){
                result[i] = nums[j];
                i++;
            }
        }
        for(int j=0; j<nums.length; j++){
            if(nums[j]%2 != 0){
                result[i] = nums[j];
                i++
            }
        } 
        return result;
    }
}