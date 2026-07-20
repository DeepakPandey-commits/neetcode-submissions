class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int result[] = new int[2];
        int duplicate = -1;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                duplicate = nums[i];
                result[0] = nums[i];
                break;
            }
        }
        int expectedSum = (n*(n+1))/2;
        int actualsum = 0;
        for(int i=0; i<nums.length; i++){
            actual sum += nums[i];
        }
        result[1] = expectedsum -(actualsum - duplicate);
        return result;
        
    }
}