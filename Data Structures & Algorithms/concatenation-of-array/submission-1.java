class Solution {
    public int[] getConcatenation(int[] nums) {
        int x = nums.length;
        int ans[] = new int[2*x];
        for(int i=0; i<x; i++){
            ans[i] = nums[i];
            ans[x+i] = nums[i];
        }
        return ans;
        
    }
}