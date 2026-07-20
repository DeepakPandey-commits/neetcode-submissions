class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int leftsum[] = new int[n];
        int sumL = 0;
        for(int i=0 ; i<n ; i++){
            sumL += nums[i];
            leftsum[i] = sumL;
        }

        int rightsum[] = new int[n];
        int sumR = 0;
        for(int j=n-1 ; j>=0 ; j--){
            sumR += nums[j];
            rightsum[j] = sumR;
        }

        for(int k=0; k<n; k++){
            if((leftsum[k] - nums[k]) == (rightsum[k] - nums[k])){
                return k;
            }
        }
        return -1;
    }
}