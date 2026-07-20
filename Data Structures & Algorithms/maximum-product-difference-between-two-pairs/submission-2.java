class Solution {
    public int maxProductDifference(int[] nums) {
        
        int Max = Integer.MIN_VALUE;
        int Max2 = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;
        int Min2 = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>Max){
                Max2 = Max;
                Max = nums[i];
            }else if(nums[i]>Max2){
                Max2 = nums[i];
            }
            if(nums[i]<Min){
                Min2 = Min;
                Min = nums[i];
            }else if(nums[i]<Min2){
                Min2 = nums[i];
            }
        }
    return ((Max*Max2)-(Min*Min2));
        

    }
}