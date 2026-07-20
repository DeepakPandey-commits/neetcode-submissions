class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count;
        int i=0; 
        int j=nums.length-1;
        while(i>j){
            if(nums[i]==nums[j]){
                count++;
            }
            i++;
            j--;
        }
    }
}