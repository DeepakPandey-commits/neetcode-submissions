class Solution {
    public int productofarray(int nums[]){
        int ans = 1;
        for(int i=0; i<nums.length; i++){
            ans *= nums[i];
        }
        return ans;
    }
    public int[] productExceptSelf(int[] nums) {
        int result[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            result[i] = productofarray(nums)/nums[i];
        }
        return result;
    }
}  
