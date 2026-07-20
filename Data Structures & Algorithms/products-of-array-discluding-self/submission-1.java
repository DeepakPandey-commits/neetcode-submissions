class Solution {
    public int mutiply(int nums[] , int excludedindex){
        int ans = 1;
        for(int i=0; i<nums.length; i++){
            if(i != excludedindex){
                ans *= nums[i];
            }
        }
        return ans;
    }
    public int[] productExceptSelf(int[] nums) {
        int result[] = new  int[nums.length];
        for(int i=0 ; i<nums.length; i++){
            result[i] = multiply(nums , i);
        }
        return result;
    }
}  
