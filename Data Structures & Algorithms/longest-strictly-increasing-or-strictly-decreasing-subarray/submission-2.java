class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int lengthofincreasing = 0;
        int lengthofdecreasing = 0;
        int max = 0;
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1 ; j<nums.length; j++){
                if(nums[i]<nums[j]){
                    lengthofincreasing += 1;
                }
                else if(nums[i]>nums[j]){
                    lengthofdecreasing += 1;
                }
            }
        }
        return Math.max(lengthofincreasing , lengthofdecreasing);
    }
}