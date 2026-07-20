class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if( nums[i] == 1){
                count ++;
                for(int j = i ; j<nums.length ; j++){
                    if(nums[j] == 1){
                        count++;
                    }else{
                        count = 0;
                        break;
                    }
                }
            }else{
                continue;
            }
        }
        return count;
    }
}