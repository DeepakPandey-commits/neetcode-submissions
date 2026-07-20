class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        for(int r=0; r<n; r++){
            boolean isSorted = true;
            for(int i=0; i<n-1; i++){
                if(nums[i]>nums[i+1]){
                    isSorted = false;
                    break;
                }
            }
            if(isSorted == true){
                return true;
            }
            int first = nums[0];
            for(int i=0; i<n-1; i++){
                nums[i] = nums[i+1];

            }
            nums[n-1] = first;
        }
        return false;
    }
}