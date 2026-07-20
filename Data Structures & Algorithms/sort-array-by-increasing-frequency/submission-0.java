class Solution {
    public int[] frequencySort(int[] nums) {
        for(int i=0; i<nums.length-1; i++){
            for(int j=0; j<nums.length-i-1; j++){
                int freq1 = 0;
                int freq2 = 0;
                for(int k=0; k<nums.length; k++){
                    if(nums[k] == nums[j]){
                        freq1++;
                    }
                }
                for(int k=0; k<nums.length; k++){
                    if(nums[k] == nums[j+1]){
                        freq2++;
                    }
                }
                if(freq1>freq2 || (freq1 == freq2 && nums[j]< nums[j+1])){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }
}