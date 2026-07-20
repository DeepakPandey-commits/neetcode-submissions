class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                int sum = 0;
                for(int l=i; l<=j; l++){
                    sum += nums[l];
                }
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
}