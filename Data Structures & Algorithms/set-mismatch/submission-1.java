class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int result[] = new int[2];
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                result[0] = nums[i];
                result[1] = nums[i]+1; 
            }
        }
        return result;
        
    }
}