class Solution {
    public int maxAscendingSum(int[] nums) {
        int Maxsum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.lenght; j++){
                int sum = 0; 
                for(int k=i; k<=j ; k++){
                    sum+=nums[k];
                }
                if(sum > Maxsum){
                    Maxsum = sum;
                }
            }
        }
        return Maxsum;
    }
}