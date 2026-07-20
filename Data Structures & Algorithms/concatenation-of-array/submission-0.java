class Solution {
    public int[] getConcatenation(int[] nums) {
        int x = nums.length-1;
        int ans[] = new int[2*x];
        for(int i=0; i<x; i++){
            ans[i] = nums[i];
            ans[nums.length] = nums[i];
        }
        return ans;
        
    }
}